package com.exam.spring04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/spring04/context.xml");
		
		BoardListTO listTO = (BoardListTO)ctx.getBean( "listTO" );
		
		for( String user : listTO.getUserLists() ) {
			System.out.println( user );
		}
		
		for ( BoardTO to : listTO.getBoardLists() ) {
			System.out.println( to.getSeq() );
			System.out.println( to.getSubject() );
		}
		
		ctx.close();
	}

}