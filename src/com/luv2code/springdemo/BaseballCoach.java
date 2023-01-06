package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
	// for depedency
	private FortuneService fortuneService;
	
	// constructor for inject
	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practic";
	}

	@Override
	public String getSetupPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}
