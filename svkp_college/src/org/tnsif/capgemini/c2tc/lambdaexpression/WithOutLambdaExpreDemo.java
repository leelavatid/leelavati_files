package org.tnsif.capgemini.c2tc.lambdaexpression;

interface Drawable //functional interface
{
	public void draw(); 
}
class Test implements Drawable
{
	int width=40;
	@Override
	public void draw() {
		System.out.println("Drawing "+width);	
	}
}
public class WithOutLambdaExpreDemo{

	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}
}//19 lines