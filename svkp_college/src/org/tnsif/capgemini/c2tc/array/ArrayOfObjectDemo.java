package org.tnsif.capgemini.c2tc.array;



class Book{
	String title;
	String author;
	double price;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display(){
		System.out.println("Title: "+title+", Author: "+author+", Price: "+price);
		System.out.println(" ");
	}
}
public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Book[] books=new Book[5];
		books[0]=new Book("Java","Leelavathi",25000);
		books[1]=new Book("Python","Durga",10000);
		books[2]=new Book("C Language","Drakshayani",13000);
		books[3]=new Book("C#","Surya",17000);
		books[4]=new Book("HTML CSS AND JS","Mahi",15000);
		
		for(Book b:books) {
			b.display();
		}
		
}

}
