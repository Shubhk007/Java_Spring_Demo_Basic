package com.di.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HappyFortuneService implements fortuneService {

	@Override
	public String getFortune() {
		return "this is from getFortune Class HappyFortuneServicewhich implements fortuneservice";
	}

}
