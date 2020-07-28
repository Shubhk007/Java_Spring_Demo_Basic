package com.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class newHappyfortune implements fortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "new Happyfortune service";
	}

}
