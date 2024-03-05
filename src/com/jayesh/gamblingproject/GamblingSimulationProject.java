package com.jayesh.gamblingproject;


public class GamblingSimulationProject {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	
	public static void gameStatus()
	{
		System.out.println("Stack Available ="+ STACK_PER_DAY);
		System.out.println("Bet per Day ="+ BET_PER_GAME);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation problem Developed by Jayesh Sonar.");
	
		gameStatus();
	}

}
