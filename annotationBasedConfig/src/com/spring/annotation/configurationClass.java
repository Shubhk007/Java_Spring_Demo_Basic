package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationClass {
@Bean
public GiveFortune fortune()
{
	return new GiveFortune();
}

@Bean
public Extra getExtra()
{
	return new Extra(fortune());
}
}
