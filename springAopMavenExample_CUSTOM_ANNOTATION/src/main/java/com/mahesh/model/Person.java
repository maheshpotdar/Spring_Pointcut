package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mahesh.Aspect_Advice_service.myCustomAnnotation;

/*@component
 * <!-- Object spring IOC Tayar karnar pan mi ethe manually kela ahe. context(spring 
		schema madhe) use kara for Spring IOC Oject. -->
 * */
public class Person {
	@Autowired
	@Qualifier(value = "e1")
	private Employee employee;

	@Autowired
	@Qualifier(value = "c1")
	private Company company;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Person [employee=" + employee + ", company=" + company + "]";
	}

}
