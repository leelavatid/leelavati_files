package basicsofjava;

public class BreakDemo {

	public static void main(String[] args) {
		int number;
		System.out.println("Shows below:");
		for(number=1;number<=10;number++)
		{
			
			if(number==5)
			{
				break;
			}
			System.out.println("the numbers are: "+number);
		}
		
	}

}
