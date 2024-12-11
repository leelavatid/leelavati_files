package org.tnsif.capgemini.c2tc.oops;

public class BMW_MotorsDemo {
   int numCars;
   String carModel;
   String carEngine;
   int carSpeed;
   void display() {
	   System.out.println("This is BMW_Motors welcome to our StoreRoom");
   }
   void welcome()
   {
	   System.out.println("welcome!");
   }
   
	public static void main(String[] args) {
		
		BMW_MotorsDemo obj=new BMW_MotorsDemo();
		obj.display();
		obj.welcome();
		obj.numCars=1500;
		obj.carModel="BMW";
		obj.carEngine="V Engine Stream";
		obj.carSpeed=80;
		System.out.println("The NumCars are: "+obj.numCars);
		System.out.println("The car Model name is: "+obj.carModel);
		System.out.println("The car Engine name is: "+obj.carEngine);
		System.out.println("The car Speed is: "+obj.carSpeed);
		
	}

}
