package com.mahesh.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionService {
	
	@Before("m1() && m2()")
	public void m4() {

		System.out.println("Firstly I am Boss Here i run first.");
	}
	
	// within for only 1 class but not supported.
	@Pointcut("execution(* com.mahesh.*.Circle.get*(..))")//circle madhil sagalya methods.
	public void m1() {
	}

	@Pointcut("execution(* com.mahesh.model.Traingle.get*(..))")//traingle madhil sagalya methods.
	public void m2() {
	}

	@Pointcut("execution(* *(..))")
	public void m3() {
	}

	
}
