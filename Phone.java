package com.spring.mvc.inter.format.dtoclass;

public class Phone {

	private String countrycode;
	private String number;
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return getCountrycode()+"-"+ getNumber();
	}
	
}
