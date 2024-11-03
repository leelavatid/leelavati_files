package basicsofjava;

public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("shows below :");
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println("the numbers are :"+i);
		}
		
	}

}
