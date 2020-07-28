package com.springApp.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		avengerMovie movie = context.getBean("myMovie",avengerMovie.class);
		movie.showData();
		System.out.println("**** Another movie******");
		batmanMovie batman = context.getBean("batmanMovie",batmanMovie.class);
		batman.showBatmanMovie();
		context.close();
	}

}
