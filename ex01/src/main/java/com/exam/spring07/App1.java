package com.exam.spring07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		GenericXmlApplicationContext ctx 
		= new GenericXmlApplicationContext("classpath:com/exam/spring07/context.xml");
		*/
		WriteAction writeAction1 =  new WriteAction();
		writeAction1.execute();
		
		BoardTO to = new BoardTO();
		WriteAction writeAction2 = new WriteAction(to);
		writeAction2.execute();
		
	}

}
