package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calUser")
public class calculatorUser {
	private calculatorHelper calculate;
	
	@Autowired
	public calculatorUser(calculatorHelper cal) {
		calculate=cal;
	}
	public void calculateAdd()
	{
		System.out.println(calculate.add(4, 5));
	}
	public void calculateSub()
	{
		System.out.println(calculate.substract(10, 5));
	}

}
