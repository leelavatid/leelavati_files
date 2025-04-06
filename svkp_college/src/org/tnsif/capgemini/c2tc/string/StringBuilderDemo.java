package org.tnsif.capgemini.c2tc.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Intial Values");
		sb.append("-Appended");
		sb.append("-Again");
		System.out.println(sb);
		sb.insert(15,"[insert]");
		sb.replace(16,27, "[replace]");
		sb.delete(2, 4);
		sb.reverse();
		System.out.println("Final StringBuilder Result : "+sb.toString());
		
		
		
	}

}
