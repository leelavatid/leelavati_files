package org.tnsif.capgemini.c2tc.oops;
 class MethodOverloadingImp{
		public int subtraction(int a,int b)
		{
			return a-b;
		}
		public int subtraction(int a,int b,int c) {
			return a-b-c;
		}
		public double subtraction(int a ,double b)
		{
			return a-b;
		}
	}
	public class MethodOverloadingDemo {
	public static void main(String[] args) {
		MethodOverloadingImp obj =new MethodOverloadingImp();
		System.out.println(obj.subtraction(5,2));
		System.out.println(obj.subtraction(70,20,30));
		System.out.println(obj.subtraction(12,10.9));
		
	}

}
