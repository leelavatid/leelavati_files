package org.tnsif.capgemini.c2tc.oops;

public class AbstractionDemo {
public static void main(String[] args) {
	MaheshDemo obj=new LeelaDemo();
	obj.calling();
	obj.aiIntegration();
	obj.satelliteCommunication();
	obj.healthMontoring();
	
}
}
abstract class MaheshDemo{
	public void calling()
		{
			System.out.println("phone integrated with calling functionality");
		}
	public abstract void aiIntegration();
	public abstract void satelliteCommunication();
	public abstract void healthMontoring();
		 }
abstract class LakshmiDemo extends MaheshDemo{
	public void aiIntegration() {
		System.out.println("phone is integratedwith AIIntegration funtionality");
	}
}
class LeelaDemo extends LakshmiDemo{

	public void satelliteCommunication()
	{
		System.out.println("phone is integrated with satelliteCommunication");
	}
	public void healthMontoring()
	{
		System.out.println("phone is integrated with healthmontoring functionality");
	}

}

