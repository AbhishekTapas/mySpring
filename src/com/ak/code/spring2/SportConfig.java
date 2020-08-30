package com.ak.code.spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ak.code.spring2")
@PropertySource("dara.properties")
public class SportConfig {

	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach getSwimCoach() {
		SwimCoach sw = new SwimCoach(happyFortuneService());
		
		return sw;
	}
}
