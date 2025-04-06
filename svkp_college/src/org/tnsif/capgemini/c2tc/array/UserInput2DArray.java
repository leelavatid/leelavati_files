package org.tnsif.capgemini.c2tc.array;

import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of rows : ");
		int rows=scan.nextInt();
		System.out.println("Enter a number od colums : ");
		int cols=scan.nextInt();
	    
		int multiDimArray[][]=new int[rows][cols];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				multiDimArray[i][j]=(i+1)*(j+1);
			}
		}
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(multiDimArray[i][j]+" ");
			}
			System.out.println(" ");
		}
	 scan.close();
	}

}
