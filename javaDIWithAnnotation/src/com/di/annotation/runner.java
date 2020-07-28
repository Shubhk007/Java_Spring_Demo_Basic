package com.di.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runner {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		tennisCoach tennis = context.getBean("tennis", tennisCoach.class);
		tennisCoach tennis1 = context.getBean("tennis",tennisCoach.class);
		System.out.println(tennis==tennis1);
		System.out.println(tennis.getDailyWorkout());
		System.out.println(tennis.getFortune());
		HappyFortuneService h= context.getBean("happyFortuneService",HappyFortuneService.class);
		HappyFortuneService h1= context.getBean("happyFortuneService",HappyFortuneService.class);
		System.out.println(h.getFortune());
		System.out.println(h==h1);
		context.close();
	}
}