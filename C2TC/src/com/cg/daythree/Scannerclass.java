package com.cg.daythree;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number: ");  
		int n= sc.nextInt(); 
		System.out.println("Entered number:"+n);
	}

}
