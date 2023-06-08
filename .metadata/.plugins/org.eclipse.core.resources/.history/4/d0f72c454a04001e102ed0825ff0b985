package com.exam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.exam.spring.model.WriteAction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext( "classpath:com/exam/spring/context.xml" );
		
		WriteAction action = (WriteAction)ctx.getBean("action1");
		//WriteAction action = (WriteAction)ctx.getBean("proxy");
		
		//전처리
		action.execute1();
		//후처리
		
		
		ctx.close();
	}
}
