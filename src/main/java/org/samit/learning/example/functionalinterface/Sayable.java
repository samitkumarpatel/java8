package org.samit.learning.example.functionalinterface;

@FunctionalInterface
public interface Sayable {
	void say(String msg);
	
	// It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);
    
    // default method
    default String getMessage(String msg) {
    	return msg;
    }
}
