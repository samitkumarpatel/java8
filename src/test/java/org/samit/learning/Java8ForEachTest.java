package org.samit.learning;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Java8ForEachTest {
	
	@Test
	public void test01() {
		List<String> listOfString = Arrays.asList("a","b","c","d","aa","absent");		
		listOfString.forEach(System.out::println);
		
		listOfString.forEach(i -> System.out.println(i));
	}
	
}
