package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5 ";
	}

	@Override
	public String getSetupPlayer() {
		// TODO Auto-generated method stub
		return "{Striker:One, Back Belakang: ['anti', 'anta', 'antu']}";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
