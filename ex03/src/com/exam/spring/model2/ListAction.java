package com.exam.spring.model2;

import java.util.ArrayList;

import com.exam.spring.model1.BoardDAO;

public class ListAction implements Action {
	private BoardDAO dao;
	
	public ListAction(BoardDAO dao ) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}

	@Override
	public void execute(){
		// TODO Auto-generated method stub
		ArrayList<String> lists = dao.boardList();
		for( String data : lists ) {
			System.out.println( data );
		}
	}

}
