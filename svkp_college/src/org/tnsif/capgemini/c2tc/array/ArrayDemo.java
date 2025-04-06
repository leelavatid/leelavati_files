package org.tnsif.capgemini.c2tc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int nums[]= {10,20,30,40,50};//static array
		System.out.println(nums[3]);
		nums[0]=60;
		System.out.println(nums[0]);
		int num[]=new int[5];//dynamic array
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		System.out.println(num[0]);
		//using for loop
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		for(int i=0;i<=4;i++) {
             System.out.println(a[i]);
	}

}
}
