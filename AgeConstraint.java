package com.spring.mvc.inter.format.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeConstraint implements ConstraintValidator<Age, Integer>{

	private int higher;
	private int lower;
	@Override
	public void initialize(Age age) {
		this.lower=age.lower();
		this.higher=age.higher();
	}
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value==null) {
			return false;
		}
		if(value<lower || value>higher) {
			return false;
		}
		return true;
		
	}

}
