package ts.action;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ts.mapper.CityMapper;
import ts.mapper.CountryMapper;
import ts.mapper.CountrylanguageMapper;
import ts.persistence.City;
import ts.persistence.CityExample;
import ts.persistence.Country;
import ts.persistence.CountryExample;
import ts.persistence.Countrylanguage;
import ts.persistence.CountrylanguageExample;

public class QueryAction {
	
	private ApplicationContext context = null;
	private DefaultSqlSessionFactory sessionFactory = null;
	
	public QueryAction() {
		if(context == null) {
			context = new ClassPathXmlApplicationContext(new String[] { "classpath:/spring/application-context.xml" });
		}
		sessionFactory = (DefaultSqlSessionFactory) context.getBean("sqlSessionFactory");
	} 
	
	public void searchCity() {
		System.out.println("======= searchCity =======");
		SqlSession session = sessionFactory.openSession();
		
		CityMapper city = session.getMapper(CityMapper.class);
		
		List<City> list = city.selectByExample(new CityExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}
		
		session.close();
	}
	
	public void searchCountry() {
		System.out.println("======= searchCountry =======");
		SqlSession session = sessionFactory.openSession();
		
		CountryMapper country = session.getMapper(CountryMapper.class);
		
		List<Country> list = country.selectByExample(new CountryExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}	
		session.close();
	}
	
	public void searchCountryLanguage() {
		System.out.println("======= searchCountryLanguage =======");
		SqlSession session = sessionFactory.openSession();
		
		CountrylanguageMapper language = session.getMapper(CountrylanguageMapper.class);
		
		List<Countrylanguage> list = language.selectByExample(new CountrylanguageExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}	
		
		session.close();
	}
	
	public static void main(String[] args) {
		QueryAction query = new QueryAction();
		query.searchCity();
		query.searchCountry();
		query.searchCountryLanguage();
	}

}
