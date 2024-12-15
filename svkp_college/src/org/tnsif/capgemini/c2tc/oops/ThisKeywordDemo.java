package org.tnsif.capgemini.c2tc.oops;
class Product{
	double price;
	Product(double price){
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
	}
	double calculateFinalPrice()
	{
		return this.price-this.calculateDiscount();
	}
}

public class ThisKeywordDemo {

	public static void main(String[] args) {
		Product obj=new Product(900);
		System.out.println("The Final Price is: "+obj.calculateFinalPrice());
		

	}

}
