package org.samit.learning.example.lambda;

public interface Sayable {
	public String say();
	
	default void hi() {
		System.out.println("Say Hello from default method");
	}
}
