package com.mahesh.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/model/spring.xml");
		ShapeService service = context.getBean("ss", ShapeService.class);
		System.out.println(""+service.getCircle().getName());
		System.out.println(""+service.getTraingle().getName());
	}

}
