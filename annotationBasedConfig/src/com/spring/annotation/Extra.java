package com.spring.annotation;

public class Extra {

	private GiveFortune fortune;
	
	public Extra(GiveFortune fortunes) {
		// TODO Auto-generated constructor stub
		this.fortune=fortunes;
	}

	
	public String fromFortune()
	{
		return fortune.getFortune();
	}
}