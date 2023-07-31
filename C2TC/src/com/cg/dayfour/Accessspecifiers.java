package com.cg.dayfour;

//class Privateclass{  
//private int data=40;  
//private void display(){
//	System.out.println("Hello java");
//	}  
//}  
class Publicclass{  
	public int data1=40;  
	public void display1(){
		System.out.println("Hello java");
		}  
	}  
	  
	 
  
 
public class Accessspecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Privateclass p=new Privateclass();  
		Publicclass p1=new Publicclass();
//		   p.display();//Compile Time Error 
		   p1.display1();

	}

	
		
}
