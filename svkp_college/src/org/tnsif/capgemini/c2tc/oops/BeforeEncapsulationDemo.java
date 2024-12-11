package org.tnsif.capgemini.c2tc.oops;

class Human{
	 int personAge;
	 String personName;
	 String gender;
	 
}
public class BeforeEncapsulationDemo {
 public static void main(String[] args) {
	 Human in=new Human();
	 in.personAge=24;
	 in.personName="leelavathi";
	 in.gender="female";
	 in.personAge=21;
	 in.personName="Mahesh";
	 in.gender="Male";
	 System.out.println("The PersonAge is : "+in.personAge);
	 System.out.println("The personNmae is : "+in.personName);
	 System.out.println("Gender :"+in.gender);
	 
	 
	 
	 
		
	}

}
