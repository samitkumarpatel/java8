package org.samit.learning.example.methodreference;

public class Java8MethodStaticReference {
	
	public static void saySomething(){  
        System.out.println("Hello, this is static method which will be a reference to say() method in Sayable interface.");  
    }
	
	public static void main(String[] args) {
		
		// Referring static method  
        Sayable sayable = Java8MethodStaticReference::saySomething;  
        
        // Calling interface method  
        sayable.say();  

	}

}
