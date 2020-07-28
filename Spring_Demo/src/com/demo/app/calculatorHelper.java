package com.demo.app;

import org.springframework.stereotype.Component;

@Component("calHelp")
public class calculatorHelper  implements calculateMethods{

	public String forTest()
	{
		return "This is test";
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		if(a>b)
			return a-b;
		else
			return 0;
	}



}
