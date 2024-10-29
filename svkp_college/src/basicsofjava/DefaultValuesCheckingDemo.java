package basicsofjava;

 class Demo
{
	  byte b;
	  short s;
	  int i;
	  float f1;
	  long l1;
	  double d1;
	  boolean b1;
	  char c1;
	  String strValue;
	  int a[];
}

public class DefaultValuesCheckingDemo {
  
	public static void main(String[] args) {
		Demo in=new Demo();
		System.out.println(in.b);
		System.out.println(in.s);
		System.out.println(in.i);
		System.out.println(in.f1);
		System.out.println(in.l1);
		System.out.println(in.d1);
		System.out.println(in.b1);
		System.out.println(in.c1);
		System.out.println(in.strValue);
		System.out.println(in.a);
		}
}
