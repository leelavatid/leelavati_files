package org.tnsif.capgemini.c2tc.lambdaexpression;

@FunctionalInterface
interface Drawable1
{
	public void draw();
}
public class WithLambdaExpDemo {

	public static void main(String[] args) {
		int width=30;
		Drawable1 d2=()->{
			System.out.println("Drawing " + width);
			};
		d2.draw();
	}
}//16 lines
