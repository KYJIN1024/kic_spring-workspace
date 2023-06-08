package com.exam.spring01.model;

public class HelloBean2 implements Hello {
	public HelloBean2() {
	// TODO Auto-generated constructor stub
		System.out.println("HelloBean2() 호출");
	}	
		@Override
	public void	sayHello(String name) {
			System.out.println( name + "님 안녕하세요" );
		}	

	}
	
