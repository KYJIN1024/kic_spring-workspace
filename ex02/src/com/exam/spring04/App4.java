package com.exam.spring04;

import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/spring04/context.xml");
		
		BoardListTO mapTO = (BoardListTO)ctx.getBean("mapTO");
		
		for( String value : mapTO.getUserMaps().values() ) {
			System.out.println( value );
		}
		
		ctx.close();
		
	}

}
