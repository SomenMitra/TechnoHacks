package com.Internship;

import java.util.Scanner;

public class Calculator {
	
	 public static int calc(int a,int b,char op) {
		 
		 int c = 0;
		 
		 switch (op) {
		  case '+':  c = a+b;
		  break;
		  case '-':  c = a-b;
		  break;
		  case '*': c = a*b;
		  break;
		  case '/': c = a/b;
		  break;
		  default:try {throw new IllegalArgumentException("Unexpected value: " + op);}
			              
		          catch (Exception e) {System.out.println(e.getMessage());}
			
		}
		
		 
		 return c;
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome To Calulator App!!");
		
		int a,b=0;
		char ch ;
		boolean boo = true;
		
		do {
			
			System.out.println("\nPress + For Addition");
			System.out.println("Press - For Substraction");
			System.out.println("Press * for Multiplication");
			System.out.println("Press / for Division");
			System.out.println("Press 0 to exit the ApplicationS");
			
			ch = s.next().charAt(0);
			switch (ch) {
			case '+':System.out.println("Enter the 1st number");
			         a = s.nextInt();
			         System.out.println("Enter the 2nd number");
			         b = s.nextInt();
			         System.out.print("Your Result is : "+calc(a, b, ch)+"\n");
			         break;
			case '-':System.out.println("Enter the 1st number");
					 a = s.nextInt();
					 System.out.println("Enter the 2nd number");
					 b = s.nextInt();
					 System.out.print("Your Result is : "+calc(a, b, ch)+"\n");
					 break;
			case '*':System.out.println("Enter the 1st number");
					 a = s.nextInt();
					 System.out.println("Enter the 2nd number");
					 b = s.nextInt();
					 System.out.print("Your Result is : "+calc(a, b, ch)+"\n");
					 break;
			case '/':System.out.println("Enter the !st number");
					 a = s.nextInt();
					 System.out.println("Enter the 2nd number");
					 b = s.nextInt();
					 System.out.println("Your Result is : "+calc(a, b, ch)+"\n");
					 break;
			case '0':boo = false;
					 break;
			default:try {throw new IllegalArgumentException("Unexpected value: " + ch);} 
			catch (Exception e) {System.out.println(e.getMessage());}
				
		    }
		} while (boo != false);
		
		
		System.out.println("Thankyou See you again !!!");

	}

}
