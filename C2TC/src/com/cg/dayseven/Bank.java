package com.cg.dayseven;

public class Bank {
	 void Interest(){
   	  System.out.println("intrest is 6");
   	  
     }
}
	class SBI extends Bank{
		void Interest() {
		 System.out.println("intrest is 0");
	 }
}
		class HDFC extends Bank{
			void Interest() {
			 System.out.println("intrest is 7");
		 }
}
	

