package com.cg.dayseven;

public class Covariantmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c;
		c=new Green();
		System.out.println(c.getColor());
		c=new Color();
		System.out.println(c.getColor());

	}

}
