package org.tnsif.capgemini.c2tc.constructor;

class Myclass2{
	String color;
	String brand;
	int cost;
	Myclass2(String color,String brand,int cost)
	{
		this.color=color;
		this.brand=brand;
		this.cost=cost;
	}
}

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("Violet","BMW",250000);
		System.out.println(obj.color +" "+obj.brand+" " + obj.cost);
		System.out.println("Another car");
		Myclass2 obj1=new Myclass2("White","Benz",200000);
		System.out.println(obj1.color +" "+ obj1.brand +" "+ obj1.cost);
		
		

	}

}
