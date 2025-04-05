package org.tnsif.capgemini.c2tc.lambdaexpression;

interface Sayable{  
    public String say();  
}  

public class LambdaExpressionExample1{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say anything.";  
    };  
    System.out.println(s.say());  
}  
}  
