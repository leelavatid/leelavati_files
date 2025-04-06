package org.tnsif.capgemini.c2tc.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Start\n");
		
		//create first thread
		Thread thread1=new Thread(()->{
			buffer.append("Mesg From Thread1 ");
		});
		
		Thread thread2=new Thread(()->{
			buffer.append("Mesg From Thread2");
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();//wait here until  the Thread1 is done
			thread2.join();//wait here until the Thread2 is done
		}
		catch(Exception m){
			System.out.println(m);
		}
		System.out.println("Final String Buffer\n"+buffer.toString());
		
		
	}

}
