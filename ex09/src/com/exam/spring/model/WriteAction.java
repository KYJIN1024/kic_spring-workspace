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
	public void execute1() {
		System.out.println( "execute1() 호출" );
	}
}
