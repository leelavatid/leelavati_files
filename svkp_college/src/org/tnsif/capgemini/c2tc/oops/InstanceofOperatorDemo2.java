package org.tnsif.capgemini.c2tc.oops;

class PaymentMethod{
	void makePayment()
	{
		System.out.println("processing payment");
	}
}
class CreditCard extends PaymentMethod{
	void swipeCard()
	{
		System.out.println("swiping the creadit card for payment");
	}
}
class PayPal extends PaymentMethod{
	void loginPayPal()
	{
		System.out.println("Loging into paypal for payment");
	}
}

public class InstanceofOperatorDemo2 {
  public static void main(String[] args) {
	  PaymentMethod obj=new PaymentMethod();
	  obj=new PayPal();
	  if (obj instanceof PayPal) {
	  PayPal pp=(PayPal)obj;
	  pp.loginPayPal();
	  }
	  else {
		  CreditCard cc=(CreditCard)obj;
		  cc.swipeCard();
		  }
	  
	}

}
