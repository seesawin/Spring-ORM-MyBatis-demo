package ts.persistence;

import java.io.Serializable;

public class Country implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Code
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Name
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Continent
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String continent;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Region
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String region;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.SurfaceArea
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Float surfacearea;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.IndepYear
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Short indepyear;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Population
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Integer population;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.LifeExpectancy
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Float lifeexpectancy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.GNP
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Float gnp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.GNPOld
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Float gnpold;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.LocalName
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String localname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.GovernmentForm
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String governmentform;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.HeadOfState
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String headofstate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Capital
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private Integer capital;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column country.Code2
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private String code2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table country
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Code
	 * @return  the value of country.Code
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Code
	 * @param code  the value for country.Code
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Name
	 * @return  the value of country.Name
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Name
	 * @param name  the value for country.Name
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Continent
	 * @return  the value of country.Continent
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Continent
	 * @param continent  the value for country.Continent
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setContinent(String continent) {
		this.continent = continent == null ? null : continent.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Region
	 * @return  the value of country.Region
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Region
	 * @param region  the value for country.Region
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setRegion(String region) {
		this.region = region == null ? null : region.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.SurfaceArea
	 * @return  the value of country.SurfaceArea
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Float getSurfacearea() {
		return surfacearea;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.SurfaceArea
	 * @param surfacearea  the value for country.SurfaceArea
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setSurfacearea(Float surfacearea) {
		this.surfacearea = surfacearea;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.IndepYear
	 * @return  the value of country.IndepYear
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Short getIndepyear() {
		return indepyear;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.IndepYear
	 * @param indepyear  the value for country.IndepYear
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setIndepyear(Short indepyear) {
		this.indepyear = indepyear;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Population
	 * @return  the value of country.Population
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Integer getPopulation() {
		return population;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Population
	 * @param population  the value for country.Population
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setPopulation(Integer population) {
		this.population = population;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.LifeExpectancy
	 * @return  the value of country.LifeExpectancy
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Float getLifeexpectancy() {
		return lifeexpectancy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.LifeExpectancy
	 * @param lifeexpectancy  the value for country.LifeExpectancy
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setLifeexpectancy(Float lifeexpectancy) {
		this.lifeexpectancy = lifeexpectancy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.GNP
	 * @return  the value of country.GNP
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Float getGnp() {
		return gnp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.GNP
	 * @param gnp  the value for country.GNP
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.GNPOld
	 * @return  the value of country.GNPOld
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Float getGnpold() {
		return gnpold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.GNPOld
	 * @param gnpold  the value for country.GNPOld
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setGnpold(Float gnpold) {
		this.gnpold = gnpold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.LocalName
	 * @return  the value of country.LocalName
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getLocalname() {
		return localname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.LocalName
	 * @param localname  the value for country.LocalName
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setLocalname(String localname) {
		this.localname = localname == null ? null : localname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.GovernmentForm
	 * @return  the value of country.GovernmentForm
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getGovernmentform() {
		return governmentform;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.GovernmentForm
	 * @param governmentform  the value for country.GovernmentForm
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setGovernmentform(String governmentform) {
		this.governmentform = governmentform == null ? null : governmentform
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.HeadOfState
	 * @return  the value of country.HeadOfState
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getHeadofstate() {
		return headofstate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.HeadOfState
	 * @param headofstate  the value for country.HeadOfState
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setHeadofstate(String headofstate) {
		this.headofstate = headofstate == null ? null : headofstate.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Capital
	 * @return  the value of country.Capital
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public Integer getCapital() {
		return capital;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Capital
	 * @param capital  the value for country.Capital
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column country.Code2
	 * @return  the value of country.Code2
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public String getCode2() {
		return code2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column country.Code2
	 * @param code2  the value for country.Code2
	 * @mbggenerated  Fri May 05 16:43:01 CST 2017
	 */
	public void setCode2(String code2) {
		this.code2 = code2 == null ? null : code2.trim();
	}
}