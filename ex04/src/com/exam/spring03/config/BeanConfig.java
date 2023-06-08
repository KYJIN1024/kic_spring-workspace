package com.exam.spring03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.exam.spring03.model.BoardTO;
import com.exam.spring03.model.WriteAction;

@Configuration
@Scope( "prototype" )
public class BeanConfig {
	//@Bean
	//public BoardTO boardTO() {
	//	return new BoardTO();
	//}
	
	@Bean
	public WriteAction writeAction1() {
		return new WriteAction();
	}
	
	@Bean
	public WriteAction writeAction2() {
		BoardTO to = new BoardTO();
		return new WriteAction( to );
	}
}
