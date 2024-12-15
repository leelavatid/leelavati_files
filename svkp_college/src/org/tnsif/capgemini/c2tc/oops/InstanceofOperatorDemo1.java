package org.tnsif.capgemini.c2tc.oops;

  class Humans{
		
	}
	class Employee extends Humans{
		
	}
	class Manager extends Employee{
		
	}
	public class InstanceofOperatorDemo1 {
	public static void main(String[] args) {
		Humans human=new Humans();
	    Employee employee=new Employee();
		Manager manager=new Manager();
		 System.out.println(employee instanceof Employee);//T
		 System.out.println(human instanceof Humans);//T
		 System.out.println(employee instanceof Humans);//T
		 System.out.println(manager instanceof Employee);//T
		 System.out.println(employee instanceof Manager);//F
		 System.out.println(human instanceof Manager );//F
		 System.out.println(human instanceof Employee);//F
		 System.out.println(manager instanceof Manager);//T
		 System.out.println(manager instanceof Humans);//T
		 
}

}
