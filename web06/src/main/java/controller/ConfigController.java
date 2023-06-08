package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import share.ShareClass;

@Controller
public class ConfigController {
	
	@Autowired
	private ShareClass shareClass;
	

	@RequestMapping( "/list1.do" )
	public String lisst1() {
		System.out.println("list1() 호출"+ shareClass );
		return "listview1";
	}
	
	@RequestMapping( "/list2.do" )
	public String handleRequest2() {
		System.out.println("list2() 호출"+ shareClass );
		return "listview2";
	}
}