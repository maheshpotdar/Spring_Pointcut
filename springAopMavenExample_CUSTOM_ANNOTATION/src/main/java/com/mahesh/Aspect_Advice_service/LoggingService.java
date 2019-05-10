package com.mahesh.Aspect_Advice_service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingService {

	// wild card asa lihayacha nasata.tar tyasathi pointcut waparayacha asto.
	// samaja 1 lakh method ahet tyasaglyana wild card pahije ahe so 1 lakh vela
	// lihav lagel.
	// so use pointcut and use pointcut method pointcut method means wildcard.
	// void packagename*.*(..)
	// ----------------------------------------------------------------------------------------------
	// if Pointcut is not well-formed: expecting '(' at character position 14
	// problem then wildcard wrong.
	// ----------------------------------------------------------------------------------------------
	// void packagename *.*(..) first star class name.method name
	/*
	 * @Pointcut("execution(* com.mahesh.model.*.get* ())") public void test() {
	 * System.out.println("20 line"); }
	 * 
	 * // suppose company madhalya getName varati apply.
	 * 
	 * @Pointcut("execution(* com.mahesh.*.Company.get*())") public void test2() { }
	 * 
	 * // suppose company madhalya getName varati apply.
	 * 
	 * @Pointcut("execution(* com.mahesh.model.*.getName())") public void test3() {
	 * }
	 * 
	 * @Before("test() && test2() && test3()") public void m1() {
	 * System.out.println("Before Aspect Run successfully."); }
	 * 
	 * // join point manaje method chi extra informtion sangato. // joinpoint nahi
	 * so direct before use.
	 * 
	 * @Before("test3()") public void joinPintsMeansMethodInfo(JoinPoint joinPoint)
	 * { System.out.println("Target Method: " + joinPoint.toString());
	 * System.out.println("\n Source Location: " + joinPoint.getSourceLocation()); }
	 * 
	 * // AOP setter manaje args(name)
	 * 
	 * @Before("args(name)") public void argsSETTERInfo(String name) {
	 * System.out.println("===>" + name); }
	 * 
	 * @Before("args(a1)") public void argsSETTER_info(String a1) {
	 * System.out.println(a1.toUpperCase()); }
	 * 
	 * @AfterReturning("args(name)") public void test4(String name) {
	 * System.out.println("After Method Returing " ); }
	 * 
	 * @After("args(name)") public void test5(String name) {
	 * System.out.println("after called....."); }
	 * 
	 * @AfterThrowing("args(name)") public void afterthrowMethod(String name) {
	 * System.out.println("After Throwing Called..."); }
	 * 
	 */

//	@Pointcut("execution(* com.mahesh.model.Employee.getName())")
//	public void m11l() {
//	}

//	@Around("m11l()")
//	public void test6() {
//		System.out.println("arounddddddddddddddddd advice method caledddd");
//	}

	// @myCustomAnnotation(package name)
	@Before("@annotation(com.mahesh.Aspect_Advice_service.myCustomAnnotation)")
	public void test7() {
		System.out.println("navin Annotation sathi.");
	}

}
