package com.exam.spring02;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다형성
		Hello hello = new HelloBean1();
		hello.sayHello("홍길동");
		System.out.println(hello);
		
		hello = new HelloBean2();
		hello.sayHello("박문수");
		System.out.println( hello );
		//같은 헬로우지만 그안에 들어가있는 값은 다름  
	}

}
