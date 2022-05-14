package org.samit.learning.udemy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasTest {

    @Test
    public void exampleOne() {
        List<String> strings = Arrays.asList("Biggest", "at", "ate", "I", "apple", "ball", "cat", "rhino", "series");
        System.out.println(
                strings.stream().collect(Collectors.groupingBy(String::length))
        );

        //{1=[I], 2=[at], 3=[ate, cat], 4=[ball], 5=[apple, rhino], 6=[series], 7=[Biggest]}
    }

    @Test
    public void exampleTwo() {
        List<String> strings = Arrays.asList("Biggest", "at", "ate", "I", "apple", "ball", "cat", "rhino", "series");
        System.out.println(
                strings.stream()
                        .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                        .collect(Collectors.toList())
        );
        //[I, at, ate, cat, ball, apple, rhino, series, Biggest]
    }

    public void exampleThree() {

    }
}
