package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.SqlMapperInter;

@Controller
public class ConfigController {
	
	@Autowired
	private SqlMapperInter mapper;

	@RequestMapping( "/form.do" )
	public String form() {
		System.out.println("form() 호출:" + mapper );
		
		String result = mapper.selectNow();
		return "form";
	}
	@RequestMapping( "/form.do" )
	public String form_ok() {
		System.out.println("form_ok() 호출:" + mapper );
		
		String result = mapper.selectNow();
		return "form_ok";
	}
}