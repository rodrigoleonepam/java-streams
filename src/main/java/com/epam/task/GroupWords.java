package com.epam.task;

import java.util.Arrays;
import java.util.List;

/**
 * Group Words by Their Starting Character Write a Java program that groups a 
 * list of words by their starting character using Java 8 Streams.
 */
public class GroupWords {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Cat","Dog","Elephant","Rabbit","Horse","Lion","Tiger","Zebra","Monkey","Donkey");
        list.stream().sorted().forEach(System.out::println);
    }
}
