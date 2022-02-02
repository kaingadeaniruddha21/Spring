package com.mouritech.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstApp {

	public static void main(String[] args) {
	
		//loading container with definition in xml file
		
   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
   
   Quotation qu = (Quotation) context.getBean("quotationService");
   String quoteForDay= qu.getQuote();
   System.out.println(quoteForDay);
   
   Greetings gr = (Greetings) context.getBean("greetingsService");
   String greet= gr.getGreet();
   System.out.println(greet);
   
   
   Employee emp = (Employee) context.getBean("emp");
	System.out.println(emp);
	System.out.println(emp.getEmpId());
	emp.setEmpId(456);
	System.out.println(emp.getEmpId());
	
	
	  Customer cd = (Customer) context.getBean("CustomerService");
	  int id= cd.getCustomerId();
	  String name = cd.getCustomerName();
	  String addr = cd.getCustomerAddress();
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(addr);
   

   
   
   
   

		
	}

}
