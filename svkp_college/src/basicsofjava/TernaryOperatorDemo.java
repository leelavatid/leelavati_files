package basicsofjava;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int a=10,b=18,c=25;
		int max=(a>b&&a>c)?a:((b>c)?b:c);
		System.out.println("The maximum value is: "+max);
		int d=10,e=15;
		int max1=(d>e?d:e);
		System.out.println("The max value is : "+max1);
	}

}
