package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runner {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		avengerMovie avenger = context.getBean("avengerMovie",avengerMovie.class);
		batmanMovie batman = context.getBean("batmanMovie",batmanMovie.class);
		//System.out.println(avenger.getMovie() + avenger.fromDI());
		//System.out.println(batman.getMovie()+avenger.fromDI());
		setterClass set = context.getBean("sampleClass",setterClass.class);
		System.out.println(set.getMovieFortune());
		System.out.println(set.getMyName());
		context.close();
	}
}
