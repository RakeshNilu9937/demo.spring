package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Country c = context.getBean("con",Country.class);
		System.out.println(c);
		
		

	}

}
