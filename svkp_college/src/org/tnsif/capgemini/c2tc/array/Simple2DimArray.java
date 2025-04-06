package org.tnsif.capgemini.c2tc.array;

public class Simple2DimArray {

	public static void main(String[] args) {
		int [][]twoDimArray= {{1,2},{3,4},{5,6}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(twoDimArray[i][j]+" ");
		}
		System.out.println(" ");
		}
	}

}
