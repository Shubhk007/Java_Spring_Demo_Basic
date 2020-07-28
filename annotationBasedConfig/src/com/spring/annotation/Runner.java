package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(configurationClass.class);
	Extra Extra = context.getBean("getExtra",Extra.class);
	System.out.println(Extra.fromFortune());
	context.close();
	}
}
