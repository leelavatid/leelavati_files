package org.tnsif.capgemini.c2tc.finalkeyword;

class cal
{
	public void show()
	{
		System.out.println("AI integration done by leelavathi");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class advcalc extends cal
{
	public void show()
	{
		System.out.println("AI integration done by mahi");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		advcalc obj=new advcalc();
		obj.show();
		obj.add(10, 5);

	}

}
