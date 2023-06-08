package com.exam.spring01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/spring01/context.xml");
		
		HelloBean helloBean = (HelloBean)ctx.getBean("helloBean");
		helloBean.sayHello("홍길동");
		
		ctx.close();
		
	}

}
