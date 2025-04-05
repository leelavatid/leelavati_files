package org.tnsif.capgemini.c2tc.statickeyword;

public class StaticVariableDemo {

       String name;
		double price;
		public static String category="smart phone";
		
		public StaticVariableDemo(String name,double price)
		{
			this.name=name;
			this.price=price;
		}
		public void displayDetails()
		{
			System.out.println("Name " +name);
			System.out.println("Price "+price);
			System.out.println("Category "+category);
			System.out.println();
			
		}
		

		public static void main(String[] args) {
			StaticVariableDemo mobile1=new StaticVariableDemo("ReaiME",20000);
			StaticVariableDemo mobile2=new StaticVariableDemo("Iphone",50000);

			System.out.println("Mobile 1 information:");
			mobile1.displayDetails();
			System.out.println("Mobile 2 information :");
			mobile2.displayDetails();
		}

	}

