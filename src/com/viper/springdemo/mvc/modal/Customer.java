package com.viper.springdemo.mvc.modal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.viper.springdemo.mvc.validation.CourseCode;

/**
 * @author Viper's Predator
 *
 */
public class Customer
{
	private String firstName;

	@NotNull(message = "Lastname is required!")
	@Size(min = 1, message = "Lastname is required!")
	private String lastName;

	@NotNull(message = "No. of passes is required!")
	@Min(value = 1, message = "Atleast one pass should be purchased.")
	@Max(value = 10, message = "No. of passes should be less than 10.")
	private Integer freePasses;

	@NotNull(message = "Postal Code is required!")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Length should be 5 char/digit")
	private String postalCode;
	
	@CourseCode(value="V-", message="Must start with V-")
	private String courseCode;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Integer getFreePasses()
	{
		return freePasses;
	}

	public void setFreePasses(Integer freePasses)
	{
		this.freePasses = freePasses;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getCourseCode()
	{
		return courseCode;
	}

	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
}
