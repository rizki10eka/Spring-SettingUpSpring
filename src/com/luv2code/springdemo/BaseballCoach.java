package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
	// for depedency
	private FortuneService fortuneService;
	
	// constructor for inject
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practic";
	}

	@Override
	public String getSetupPlayer() {
		
		// use my fortune to get fortune
		
		return fortuneService.getFortune();
	}

}
