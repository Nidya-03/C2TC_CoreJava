package com.cg.daytwo;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter the choice(1,2,3,4): ");  
		int choice= sc.nextInt(); 
		System.out.println("Lets see which singer you chose;)");
		System.out.println(".........................");
		switch(choice) {
		case 1:
			System.out.println("It's Selena Gomez ");
			break;
		case 2:
			System.out.println("It's Olivia Rodrigo ");
			break;
		
		case 3:
			System.out.println("It's Taylor Swift ");
			break;
		case 4:
			System.out.println("It's Ariana Grande ");
			break;
		}

	}

}
