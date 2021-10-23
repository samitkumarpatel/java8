package org.samit.learning.example.functionalinterface;

public class FunctionalInterfaceExample1 implements Sayable{
	
	@Override
	public void say(String msg) {
		System.out.println(String.format("Hello %s",msg));
	}
	
	public static void main(String[] args) {
		new FunctionalInterfaceExample1().say("Samit");
	}

	

}
