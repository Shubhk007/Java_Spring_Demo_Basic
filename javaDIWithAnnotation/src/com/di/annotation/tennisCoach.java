package com.di.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennis")
@Scope("singleton")
public class tennisCoach implements coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private fortuneService fortune;
//	public tennisCoach(HappyFortuneService fortune) {
//		this.fortune= fortune;
//	}
//	public tennisCoach() {
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public String getDailyWorkout() {
		return "DO practice today";
	}
	@PostConstruct
	public void myStartup()
	{
		System.out.println("init method");
	}
	@PreDestroy
	public void myCleanup()
	{
		System.out.println("destroy method");
	}
	
//	@Autowired
//	public void setFortune(HappyFortuneService fortune) {
//		this.fortune = fortune;
//	}

	@Override
	public String getFortune() {
		return fortune.getFortune();
	}

}
