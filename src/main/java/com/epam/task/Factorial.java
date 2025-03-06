package com.epam.task;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Calculate Factorial Using Streams Write a Java program that calculates the factorial 
 * of a given number using Java 8 Streams.
 */
public class Factorial {
    
    public static void main(String args[]) {
        int n = 5;
        Integer fact = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
