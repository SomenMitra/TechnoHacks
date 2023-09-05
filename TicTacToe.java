package com.Internship;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static int uCounter = 0;
	static int cCounter = 0;
	
	public static String computerChoice() {
		
		Random rd = new Random();
		String comChoice="";
		int a = rd.nextInt(3)+1;
		if(a == 1)
			comChoice = "Rock";
		else if (a==2)
			comChoice = "Paper";
		else if (a==3) 
			comChoice = "Scissor";
			
		return comChoice;
	}
	
	public static String userChoice(int a) {
		String userChoice = "";
		if(a == 1)
			userChoice = "Rock";
		else if (a == 2)
			userChoice = "Paper";
		else if (a == 3)
			userChoice = "Scissor";
		return userChoice;
	}
	
	public static void decideWinner(String userVal, String compVal) {
		if(userVal.equals("Rock") && compVal.equals("Rock")) {
			System.out.println("Tie");
		    uCounter++; cCounter++;
		}
		else if (userVal.equals("Rock") && compVal.equals("Scissor")) {
			System.out.println("Point goes to User");
			uCounter++; cCounter--;
		}
		else if (userVal.equals("Rock") && compVal.equals("Paper")) {
			System.out.println("Point goes to Computer");
			uCounter--; cCounter++;
		}
		else if (userVal.equals("Scissor") && compVal.equals("Rock")) {
			System.out.println("Point goes to Computer");
			uCounter--; cCounter++;
		}
		else if (userVal.equals("Scissor") && compVal.equals("Scissor")) {
			System.out.println("Tie");
			uCounter++; cCounter++;
		}
		else if (userVal.equals("Scissor") && compVal.equals("Paper")) {
			System.out.println("Point goes to user");
			uCounter++; cCounter--; 
		}
		else if (userVal.equals("Paper") && compVal.equals("Paper")) {
			System.out.println("Tie");
			uCounter++; cCounter++;
		}
		else if (userVal.equals("Paper") && compVal.equals("Rock")) {
			System.out.println("Point goes to User");
			uCounter++; cCounter--;
		}
		else if (userVal.equals("Paper") && compVal.equals("Scissor")) {
			System.out.println("Point goes to Computer");
			uCounter--; cCounter++;
		}
			
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Please make your choice !!\n USER : "+uCounter+"\tComputer :"+cCounter);
			System.out.println("\npress 1 for Rock");
			System.out.println("Press 2 for Paper");
			System.out.println("Press 3 for Scissor\n");
			
			String userVal = userChoice(s.nextInt());
			String comVal = computerChoice();
			decideWinner(userVal, comVal);
			if (uCounter == 5 || cCounter == 5)
				break;
		} while (uCounter < 6 || cCounter < 6);
		
		if (uCounter == 5)
			System.out.println("Game won by User "+uCounter+" points");
		else if(cCounter == 5)
			System.out.println("Game won by Computer "+cCounter+" points");

	}

}
