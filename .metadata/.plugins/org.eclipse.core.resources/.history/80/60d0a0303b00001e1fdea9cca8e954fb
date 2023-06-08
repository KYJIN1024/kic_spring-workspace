package controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import model1.JdbcDAO;

@Configuration
public class ConfigController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private JdbcDAO dao;
	
	@RequestMapping( "/jdbc1.do" )
	public String jdbc1() {
		
		String result = dao.selectNow();
		System.out.println("결과 : " + result );
			
		return "jdbc1";
	}
		
	@RequestMapping( "/jdbc2.do" )
	public String jdbc2() {
			
		String result = dao.selectNow();
		System.out.println("결과 : " + result );
			
		return "jdbc2";
	}
}
	
	