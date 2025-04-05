package org.tnsif.capgemini.c2tc.interfacedemoexamples;
//class implementing the interface
public class Car implements Vehicle
{
    private String model;
    
    
    //constructor
          
   public Car(String model)
   {
	   this.model=model;
   }
     
	@Override
	public  void start() {
		
		System.out.println("Car " + model + " is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car " +model +" is stopped");
	}

}
