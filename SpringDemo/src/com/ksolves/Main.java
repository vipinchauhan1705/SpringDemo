package com.ksolves;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		
		//Ioc 
//		Resource resource= new ClassPathResource("employeebean.xml");
//		XmlBeanFactory factory =new XmlBeanFactory(resource);
////		
//		Employee e1= (Employee) factory.getBean("emp1");
//		Employee e2= (Employee) factory.getBean("emp2");
		
		
		
		//with application context

		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = (Employee) context.getBean("emp2");
		
	System.out.println("Employeedetails:"+e1);
	System.out.println("Employeedetails:"+e2);
		
	}

}

