package com.epam.task;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find Prime Numbers in a Range Write a program that finds all prime numbers in a 
 * given range using Java 8 Streams.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        
        List<Integer> primes = IntStream.rangeClosed(start, end)
                .filter(x -> isPrime(x))
                .boxed()
                .collect(Collectors.toList());
 
        System.out.println("Prime numbers: " + primes);
    }

    private static boolean isPrime(int number) {
        return number > 1 && 
            IntStream.range(2, number)
                .noneMatch(n -> number % n == 0);
    }
}
