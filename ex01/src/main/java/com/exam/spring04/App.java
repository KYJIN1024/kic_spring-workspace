package com.exam.spring04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:com/exam/spring04/context.xml"); //xml데이터 로드
		
		//HelloBean1 hello = (HelloBean1)ctx.getBean("helloBean1");
		Hello hello = (Hello)ctx.getBean( "helloBean1" );
		hello.sayHello( "홍길동" );
		
		hello = (Hello)ctx.getBean( "helloBean2" );
		hello.sayHello( "박문수" );
		
		ctx.close();
	}
}
