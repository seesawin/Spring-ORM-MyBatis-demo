package ts.action;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import ts.mapper.CityMapper;
import ts.persistence.City;
import ts.persistence.CityExample;

public class QueryAction {
	
	public SqlSessionTemplate sqlSession = null;
	
	public DataSourceTransactionManager txManager = null;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void setTxManager(DataSourceTransactionManager txManager) {
		this.txManager = txManager;
	}

	public void inserCity(String name, String code, String district, Integer pooulation) throws Exception {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = txManager.getTransaction(transactionDefinition);
		
		try {
			CityMapper city = sqlSession.getMapper(CityMapper.class);
			City example = new City();
			example.setName(name);
			example.setCountrycode(code);
			example.setDistrict(district);
			example.setPopulation(pooulation);
			city.insert(example);
			
			if(1 == 1) {
				throw new Exception("Transaction ฟ๙ป~ด๚ธี!");
			}
			
		} catch (Exception e) {
			txManager.rollback(transactionStatus);
			throw e;
		}
		
		txManager.commit(transactionStatus);
	}
	
	public void searchCityByExample(String name) {
		System.out.println("======= searchCityByExample =======");
		
		CityMapper city = sqlSession.getMapper(CityMapper.class);
		CityExample example = new CityExample();
		example.createCriteria().andNameEqualTo(name);
		List<City> list = city.selectByExample(example);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:/spring/application-context.xml" });
		QueryAction query = (QueryAction) context.getBean("QueryAction");
		
		String name = "Taipei7";
//		query.inserCity(name, "TWN", "GENM", 56565);
		query.searchCityByExample(name);
	}

}
