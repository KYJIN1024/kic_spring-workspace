package com.exam.spring03;

public class HelloBean2  {
	
	public HelloBean2() {
		// TODO Auto-generated constructor stub
		System.out.println( "HelloBean2 () 호출"  );

	}
	// new를 스프링이 대신해줌..
	public void sayHello(String name) {
		System.out.println("Hello" + name );
	}
}
