package com.epam.task;

import java.util.Arrays;
import java.util.List;

/**
 * Find the Second Largest Element in an Array Write a program that finds the 
 * second largest element in an array using Java 8 Streams.
 */
public class SecondLargest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 6, 3, 5, 2, 2, 8, 6);
        Integer second = list.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findAny()
                .get();

        System.out.println("Second largest is " + second);
    }
}
