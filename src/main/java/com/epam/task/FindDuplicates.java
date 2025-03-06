package com.epam.task;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find Duplicate Elements in an Array Write a Java program that takes an array of integers 
 * and finds all the duplicate elements. Use Java 8 Streams to solve the problem.
 */
public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 6, 3, 5, 2, 2, 8, 6);
        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
