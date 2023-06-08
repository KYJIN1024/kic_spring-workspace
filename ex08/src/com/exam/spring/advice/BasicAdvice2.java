package com.exam.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class BasicAdvice2 {
	
	public Object longAround( ProceedingJoinPoint joinpoint ) throws Throwable {
		
		System.out.println( "전처리 구간 2");
		
		Object rtnObj = joinpoint.proceed();
		System.out.println( "후처리 구간 2");
		
		return rtnObj;
	}

	public void before() throws Throwable{
		System.out.println("전처리 구간 1");
	}
	
	public void after() throws Throwable{
		System.out.println("후처리 구간 1");
	}
	
}
