package com.exam.spring03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext( "classpath:com/exam/spring03/context.xml" );
		
		//HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
		HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean3");
		helloBean1.sayHello("홍길동");
		
		// new가 없음 
		HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean2.sayHello("박문수");
		
		ctx.close();
	}

}
