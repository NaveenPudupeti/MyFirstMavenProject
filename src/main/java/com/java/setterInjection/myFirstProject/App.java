package com.java.setterInjection.myFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	
	public static void main(String[] args) {
		
		//spring container
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//Customer customer = (Customer)context.getBean("cus");
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	                 
	    Order order = (Order)context.getBean("ord");	
	    
	    
	    System.out.println("ProductId::"+order.getProductId());
	    System.out.println("ProductName::"+order.getProductName());
	   // System.out.println("Date::"+order.getDate());
	   // System.out.println("Customer::"+order.getCustomer());
	    
	    System.out.println("CustomerName::"+order.getCustomer().getName());
	    System.out.println("CustomerEmail::"+order.getCustomer().getEmail());
	    System.out.println("CustomerAddress::"+order.getCustomer().getAddress());
	    System.out.println("CustomerMobile::"+order.getCustomer().getMobile());
	
	
		
	}
}
