package com.Internship;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		long num = (long)Math.round(Math.random() * 10);
		
		boolean b = true;
		
		do {
			System.out.println("Please guess the number !!");
			long guess = s.nextLong();
			if(num == guess) {
				b = false;
				System.out.println("You guessed it right its "+num);}
			else {
				if(num > guess) {
					long diff = num - guess;
					System.out.println("Hint you lack by "+diff);
				}
				else {
					long diff = guess - num;
					System.out.println(" Hint you exceed by "+diff);
				}
			}
				
		} while (b != false);
		
		System.out.println("\nThank you see you again !!");
	}

}
