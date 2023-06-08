package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.SqlMapperInter;

@Controller
public class ConfigController {
	
	@Autowired
	private SqlMapperInter mapper;

	@RequestMapping( "/jdbc1.do" )
	public String jdbc1() {
		System.out.println("jdbc1() 호출:" + mapper );
		
		String result = mapper.selectNow();
		System.out.println("결과 : " + result );
			
		return "jdbc1";
	}
}