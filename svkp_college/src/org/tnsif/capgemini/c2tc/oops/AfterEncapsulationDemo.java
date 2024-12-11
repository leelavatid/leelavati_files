package org.tnsif.capgemini.c2tc.oops;

class Human1{
	private int personAge;
	private String personName;
	private String gender;
	public  void setAge(int age)
	{
	personAge=age;
	 }
	public int getAge() {
		return personAge;
	}
	public void setName(String name) {
		personName=name;
	}
	public String getName()
	{
		return personName;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
}
public class AfterEncapsulationDemo {
public static void main(String[] args) {
	Human1  obj=new Human1();
	obj.setName("leela");
	obj.setAge(21);
	obj.setGender("Female");
	System.out.println("The Person Name is: "+obj.getName());
	System.out.println("The Person Age is : "+obj.getAge());
	System.out.println("Gender:"+obj.getGender());
	obj.setName("mahesh");
	obj.setAge(24);
	obj.setGender("male");
	System.out.println("The Person Name is: "+obj.getName());
	System.out.println("The Person Age is : "+obj.getAge());
	System.out.println("Gender: "+obj.getGender());

	
}

}
