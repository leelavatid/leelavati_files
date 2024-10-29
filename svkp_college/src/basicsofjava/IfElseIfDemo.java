package basicsofjava;

public class IfElseIfDemo {

	public static void main(String[] args) {
	 int score=38;
	 if(score>=90)
	 {
		 System.out.println("Congratulations..you got a Grad A+");
	 }
	else if(score>=80)
     {
			System.out.println("congrts.. you got a Grad A"); 
	 }
	else if(score>=70)
	{
	 System.out.println("congrts ..you got a Grad B+");
    }
	else if(score>=60)
	{

		System.out.println("congrts..u got a Grad B");
	}
	else if(score>=50)
	{

		System.out.println("congrts..you got a Grad C");
	}
	else if(score>=40)
	{
		System.out.println("congrts..u got a Grad D");
	}
	else 
	{
	System.out.println("Better luck next time.. you Failed");
	}
	}
}