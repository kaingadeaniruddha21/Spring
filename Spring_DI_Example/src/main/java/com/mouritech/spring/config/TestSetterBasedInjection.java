package com.mouritech.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.spring.setterDI.SetterBasedInjectionExample;



public class TestSetterBasedInjection {

	public static void main(String[] args) {
		//Loading container with definition(configuration) given in XML file
		//ApplicationContext container = 
				//new ClassPathXmlApplicationContext("applicationContext.xml");
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(AppConfiguration.class);
		SetterBasedInjectionExample sbie = container.getBean(SetterBasedInjectionExample.class);
		sbie.sendMsg("message sent using .........");

	}

}