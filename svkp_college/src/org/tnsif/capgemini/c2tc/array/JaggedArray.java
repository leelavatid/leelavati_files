package org.tnsif.capgemini.c2tc.array;

public class JaggedArray {

	public static void main(String[] args) {
		//declare the jagged array
		int [][]arrStudentInGrade=new int[3][];
		
		//Intialize Sub Array
		arrStudentInGrade[0]=new int[2];
		arrStudentInGrade[1]=new int[3];
		arrStudentInGrade[2]=new int[1];
		
		//Assign value to the elements
		arrStudentInGrade[0][0]=100;
		arrStudentInGrade[0][1]=200;
		arrStudentInGrade[1][0]=300;
		arrStudentInGrade[1][1]=400;
		arrStudentInGrade[1][2]=500;
		arrStudentInGrade[2][0]=600;
		
		//Iterate and print
		for(int i=0; i<arrStudentInGrade.length;i++) {
		for(int j=0;j<arrStudentInGrade[i].length;j++) {
			System.out.println("Grade "+(i+1)+" Student "+(j+1)+" :"+arrStudentInGrade[i][j]);
		}
		}
		
 }

}
