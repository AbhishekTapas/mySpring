package com.ak.code.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	private FortuneService myFortuneService;
	
	@Value("${name}")
	private String myName;
	
	@Value("${email}")
	private String myEmail;
	
	public SwimCoach() {
		
	}

	public SwimCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		myFortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		System.out.println(myName + " ... " + myEmail);
		return "Swim 10 Miles a day !!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
