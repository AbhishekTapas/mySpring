package com.ak.code.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	//field Injection
	@Autowired
	// used for specifying the injection autowired, may have diff implementations
	// 1st letter small, then it a CLASS NAME...
	//RESTFortuneService --> RESTFortuneService
	@Qualifier("happyFortuneService")
	private FortuneService myFortuneService;
	
	//Using Construtor Injection
//	@Autowired
//	public TennisCoach(FortuneService myFortuneService) {
//		this.myFortuneService = myFortuneService;
//	}
	
	//using Setter Injection - Method can be of any name
//	@Autowired
//	public void setMyFortuneService(FortuneService myFortuneService) {
//		this.myFortuneService = myFortuneService;
//	}
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("This is the default Constructor of Tennis class");
	}
	
	@PostConstruct
	public void doAfter() {
		System.out.println("I am in Post Workout Methods");
	}
	
	@PreDestroy
	public void doBefore() {
		System.out.println("I am in pre Workout Methods");
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Getting daily workout of Tennis Coach";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
