package com.mouritech.spring.config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.spring.constructorbasedDI.ConstructorBasedDIExample;




public class TestConstructorBasedInjection {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ConstructorBasedDIExample cbie = container.getBean(ConstructorBasedDIExample.class);
		cbie.sendMsg("message sent using .........");
	}

}