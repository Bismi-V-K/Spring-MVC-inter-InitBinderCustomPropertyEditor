package com.spring.mvc.inter.format.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeConstraint.class)
public @interface Age {

	String message() default "Age cannot be more than 30 or less than 18";

	int lower() default 18;

	int higher() default 30;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
