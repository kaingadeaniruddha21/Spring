package com.mouritech.spring.config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.spring.fieldbasedDI.FieldBasedInjection;



public class TestFieldBasedInjection {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection fbie = container.getBean(FieldBasedInjection.class);
		fbie.sendMsg("message sent using .........");
	}
}