package org.tnsif.capgemini.c2tc.scanner_bufferreader;
import java.util.Scanner;

public class AdvanceScannerMethods {

   public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter some data(you can enter number or text)");
			while(in.hasNext())
			if(in.hasNextInt())
				{
					int intvalue=in.nextInt();
					System.out.println("read an integer "+ intvalue);
				}
			else if (in.hasNextDouble())
			{
				double doublevalue=in.nextDouble();
				System.out.println("read an double "+doublevalue);
			}
			else
			{
				String stringvalue=in.next();
				System.out.println("unknow input " +stringvalue);
			}

		

	}

	}

