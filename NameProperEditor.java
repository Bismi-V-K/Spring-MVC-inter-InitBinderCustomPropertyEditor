package com.spring.mvc.inter.format.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NameProperEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String convertedText=text.toUpperCase();
		setValue(convertedText);
	}

	
}
