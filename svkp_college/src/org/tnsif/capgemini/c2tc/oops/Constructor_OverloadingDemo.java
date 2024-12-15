package org.tnsif.capgemini.c2tc.oops;

class Book{
    String title;
    int page;
    Book()
    {
	title="unknown";
	page=0;
    }
    Book(String title){
    	this.title=title;
    	page=0;
    }
    Book(String title,int page){
    	this.title=title;
    	this.page=page;
    }
    void display()
    {
    	System.out.println("The title is : "+title+" The number of pages: "+page);
    }
    }

public class Constructor_OverloadingDemo {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book("Python Programming Language");
		Book book3=new Book("Java programming Language",12000);
		book1.display();
		book2.display();
		book3.display();
		
	}

}
