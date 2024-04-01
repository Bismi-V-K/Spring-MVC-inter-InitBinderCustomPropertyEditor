package com.spring.mvc.inter.format.dtoclass;

import java.util.Arrays;

import com.spring.mvc.inter.format.validator.Age;

import jakarta.validation.constraints.NotEmpty;

public class DtoClass {

	@NotEmpty(message = "* cannot be empty")
	private String name;
	private char[] password;
	private String countryname;
	private CommunicationDto comdto;
	private String date;
	
	@Age(higher=30,lower=18,message="age cannot be less than 18 and more than 30")
	private Integer age;
	
	public CommunicationDto getComdto() {
		return comdto;
	}
	public void setComdto(CommunicationDto comdto) {
		this.comdto = comdto;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	@Override
	public String toString() {
		return "DtoClass [name=" + name + ", password=" + Arrays.toString(password) + ", countryname=" + countryname
				+ "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
