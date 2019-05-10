package com.mahesh.model;

import com.mahesh.Aspect_Advice_service.myCustomAnnotation;

public class Company {
	private String name;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	@myCustomAnnotation
	public String getName() {
		String name = "COMPAQ PC";
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Company ne return kele Watch to AMeza Top Up Company La.");
		// throw new RuntimeException();

	}

//	@Override
//	public String toString() {
//		return "Company [name=" + name + "]";
//	}

}
