package com.exam.spring08;

public class ListAction {
	private BoardTO to;
	
	public ListAction() {
		// TODO Auto-generated constructor stub
		System.out.println("ListAction(BoardTO to) 호출");
		this.to = to;		
	}
	
	public void execute( ) {
		System.out.println( to.getSeq() );
		System.out.println( to.getSubject() );
	}
}
