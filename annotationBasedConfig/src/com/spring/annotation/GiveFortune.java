package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class GiveFortune implements fortune {

	@Override
	public String getFortune() {
		return "this is your fortune";
	}

}
