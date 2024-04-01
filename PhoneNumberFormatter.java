package com.spring.mvc.inter.format.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.mvc.inter.format.dtoclass.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("Inside the print formatter method");
		return phone.getCountrycode()+"-"+phone.getNumber();
	}

	@Override
	public Phone parse(String PhoneNumber, Locale locale) throws ParseException {
		String arr[]=PhoneNumber.split("-");
		Phone phone=new Phone();
		int index=PhoneNumber.indexOf('-');
		if(index==-1) {
			phone.setCountrycode("91");
			phone.setNumber(arr[1]);
		}
		else {
			phone.setCountrycode(arr[0]);
			phone.setNumber(arr[1]);
		}
		return phone;
	}

}
