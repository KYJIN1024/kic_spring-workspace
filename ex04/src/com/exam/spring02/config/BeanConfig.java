package com.exam.spring02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.exam.spring01.model.HelloBean1;
import com.exam.spring01.model.HelloBean2;
import com.exam.spring02.model.HelloBean;

@Configuration
@Scope( "prototype")
public class BeanConfig {
	
	@Bean
	public HelloBean helloBean1() {
		return new HelloBean();
	}
	
	//생성자 
	@Bean
	public HelloBean helloBean2() {
		return new HelloBean( "박문수" );//생성자주입
	}

}





