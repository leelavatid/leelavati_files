package org.tnsif.capgemini.c2tc.finalkeyword;
class Calc //leela
{
	public void show()
	{
		System.out.println("AI integration done by leela");
	}
}
class Adav extends  Calc //durga
{
	public void show()
	{
		System.out.println("AI integration done by durga");
	}
}
public class FinalClassDemo {

	public static void main(String[] args) {
		Adav in=new Adav();
		in.show();
		

	}

}