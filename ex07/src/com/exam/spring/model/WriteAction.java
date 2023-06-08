package com.exam.spring.model;

public class WriteAction {
	private String writer;
	
	public WriteAction() {
		// TODO Auto-generated constructor stub
		System.out.println( "WriteAction() 호출");
	
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	// core concern (핵심 기능)
	public void execute() {
		System.out.println( "execute() 호출" );
	}
}
