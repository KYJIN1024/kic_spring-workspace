package com.exam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.exam.spring.model2.Action;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/spring/context.xml");
		
		// DAO(X) 생성할 필요가 없음 
		
		Action action = (Action)ctx.getBean( "action" );
		action.execute();
		
		ctx.close();
		
	}

}
