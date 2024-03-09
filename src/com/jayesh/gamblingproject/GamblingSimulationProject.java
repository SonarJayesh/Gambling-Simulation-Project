package com.jayesh.gamblingproject;

import java.util.Random;

public class GamblingSimulationProject {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	private static final int[] winAmount = new int[20];
	private static final int[] looseAmount = new int[20];
	
	private static final int[] won_Maximum = new int[20];
	private static final int[] lost_Maximum = new int[20];
	
	private static int total_Win_Day = 0;
	private static int total_Loose_Day = 0;
	static int playStatus;
	
	static int maxWon = 0;
	static int maxLoose = 0;
	static int winIndex = 0;
	static int looseIndex = 0;
	
	public static void gameStatus() {
		
		System.out.println("Stack Available ="+ STACK_PER_DAY);
		System.out.println("Bet per Game ="+ BET_PER_GAME);
		
	}
	
	public static void gamePlay() {
		
		
		gameStatus();
		for(int i=0; i<20; i++) {
				
			System.out.println("Day = "+ (i+1));
			 int winStack = 0;
			 int looseStack = 0;
			 
			 	while(true) {

				
			 		Random random = new Random();
			 		playStatus = random.nextInt(9) % 2;
				
		
			 		if(playStatus == LOOSE) {
				
			 			looseStack += 1;
			 		}
			 		else {
				
			 			winStack += 1;
					
			 		}
			 		if(winStack == STACK_PER_DAY / 2) {
			 			total_Win_Day += 1;
			 			
			 			if(looseStack < winStack) {
			 				
			 					won_Maximum[i] = winStack - looseStack;
			 					if(maxWon < won_Maximum[i]) {
			 						maxWon = won_Maximum[i];
			 						winIndex = i+1;
			 						
			 					}
			 			}
			 			
			 			break;
			 		}
			 		if(looseStack == STACK_PER_DAY /2) {
			 			total_Loose_Day += 1;
			 				if(maxLoose < looseStack) {
			 					
			 					lost_Maximum[i] = looseStack - winStack;
			 					if(maxLoose < lost_Maximum[i]) {
			 						maxLoose = lost_Maximum[i];
			 						looseIndex = i+1;
			 						
			 					}
			 				}
			 			break;			
				}

			}
			 
			 	winAmount[i] = winStack;
			 	looseAmount[i] = looseStack;
			 
			 	System.out.println("Winning Stack = "+ winStack);
			 	System.out.println("Loose Stack = "+ looseStack);
			 	System.out.println("----------------------------------");
			 	
			}
		
			System.out.println("Total Win Day Month = "+ total_Win_Day);
			System.out.println(winIndex + " is the Luckiest Day, Won Rs : "+ maxWon);
			System.out.println("Total Loose Day Month = "+ total_Loose_Day);
			System.out.println(looseIndex + " is the UnLuckiest Day, Lost Rs : "+ maxLoose);
			
	}		
			
	public static void main(String[] args) {
		
			System.out.println("Welcome to Gambling Simulation problem Developed by Jayesh Sonar.");
		
			gamePlay();
			
		}
}
