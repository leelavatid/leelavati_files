package org.tnsif.capgemini.c2tc.oops;
class Vehicles{
	void move() {
		System.out.println("Vehicle is moving");
	}
}
class Car4 extends Vehicles{
    @Override
	void move() {
		System.out.println("Car has four wheelers");
			}

}
class Bike extends Vehicles{
	void move()
	{  
	 System.out.println("Bike has two wheelers");
	}
}
class Train extends Vehicles{
	void move() {
		System.out.println("Train has carriages");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Vehicles obj=new Vehicles();
		obj.move();
		obj=new Car4();
		obj.move();
		obj=new Bike();
		obj.move();
		obj=new Train();
		obj.move();
		

	}

}
