package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5";
	}

	@Override
	public String getSetupPlayer() {
		// TODO Auto-generated method stub
		return "{Striker:One, Back Belakang: ['anti', 'anta', 'antu']}";
	}

}
