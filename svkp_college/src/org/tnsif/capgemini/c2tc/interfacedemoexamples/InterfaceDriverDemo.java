package org.tnsif.capgemini.c2tc.interfacedemoexamples;

public class InterfaceDriverDemo {

	public static void main(String[] args) {
		//you can't instantiate the interface itself
		Vehicle car=new Car("Ferrari ");
		Vehicle bike=new Bike("Honda Activa ");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("Maximun speed for vehicle " +Vehicle.max_speed);
	}
}
