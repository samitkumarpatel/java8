package org.samit.learning.example;

interface Sayable{  
    void say();  
} 

public class Java8MethodReference {
	
	public static void saySomething(){  
        System.out.println("Hello, this is static method which will be a reference to say() method in Sayable interface.");  
    }
	
	public static void main(String[] args) {
		
		// Referring static method  
        Sayable sayable = Java8MethodReference::saySomething;  
        
        // Calling interface method  
        sayable.say();  

	}

}
