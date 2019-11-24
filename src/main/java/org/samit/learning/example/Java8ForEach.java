package org.samit.learning.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
}


public class Java8ForEach {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) 
			myList.add(i);
		
		
		//Traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//Traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
		});
		
		//Traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
		//Traversing with forEach by using method reference
		myList.forEach(System.out::println);
	}

}

