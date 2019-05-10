package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;
import com.mahesh.model.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/mainApp/spring.xml");
		Person person = context.getBean("p1", Person.class);
		System.out.println("Company Data: " + person.getCompany().getName());
		Employee employee = (Employee) person.getEmployee();
		employee.setName("Rohit Sharma");

	}
} 
