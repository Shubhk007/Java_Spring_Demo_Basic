package com.demo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class calculatorMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		calculatorUser user=context.getBean("calUser",calculatorUser.class);		
		user.calculateAdd();
		user.calculateSub();
		calculatorHelper cal= context.getBean("calHelp",calculatorHelper.class);
		System.out.println(cal.forTest());
		context.close();
	}

}
