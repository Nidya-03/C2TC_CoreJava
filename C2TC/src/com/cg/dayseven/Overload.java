package com.cg.dayseven;

public class Overload {
	 public int add(int a,int b) {
		 int c=a+b;
			System.out.println("Addition of 2 numbers "+c);
			return c;
		}
	 public int add() {
		 System.out.println("Addition method");
		return 0;
	 }
	public int  add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("Addition of 3 numbers "+d);
		return d;
	}
	}
	
