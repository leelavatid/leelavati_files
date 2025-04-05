package org.tnsif.capgemini.c2tc.lambdaexpression;
import java.util.*;  
	public class LambdaExpressionExample5{  
	    public static void main(String[] args) {  
	          
	        List<String> list=new ArrayList<String>();  
	        list.add("mahi");  
	        list.add("manikanta");  
	        list.add("sravani");  
	        list.add("jashvin");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	    }  
}
