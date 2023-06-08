package com.exam.spring05;

import java.util.Properties;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/spring04/context.xml");
		
		Properties configs = new Properties();
		configs.put( "server","192.168.1.100" );
		configs.put( "connectionTime","5000" );
		
		BoardPropertiesTO configsTO = new BoardPropertiesTO();
		configsTO.setConfigs(configs);
		
		Properties newConfigs = configsTO.getConfigs();
		
		System.out.println(configs.getProperty( "server" ) );
		System.out.println(configs.getProperty( "connectionTime" ) );
		
	}

}
