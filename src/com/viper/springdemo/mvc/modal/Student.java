package com.viper.springdemo.mvc.modal;

/**
 * @author Viper's Predator
 *
 */
public class Student
{
	private String firstname;
	
	private String lastname;
	
	private String country;
	
	private String favLang;
	
	private String[]  opSys;

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getFavLang()
	{
		return favLang;
	}

	public void setFavLang(String favLang)
	{
		this.favLang = favLang;
	}

	public String[] getOpSys()
	{
		return opSys;
	}

	public void setOpSys(String[] opSys)
	{
		this.opSys = opSys;
	}
}

