# Project Java Streams

### Author: Rodrigo León

### Tasks:
* Find Duplicate Elements in an Array Write a Java program that takes an array of integers and finds all the duplicate elements. Use Java 8 Streams to solve the problem.
* Calculate Factorial Using Streams Write a Java program that calculates the factorial of a given number using Java 8 Streams.
* Find the Second Largest Element in an Array Write a program that finds the second largest element in an array using Java 8 Streams.
* Group Words by Their Starting Character Write a Java program that groups a list of words by their starting character using Java 8 Streams.
* Find Prime Numbers in a Range Write a program that finds all prime numbers in a given range using Java 8 Streams.

### Solutions

1. FindDuplicates

This program takes an array and create a Map using the number as a key
and the counter of occurrences as a value. Then filter any element of
the map if the value is greater than 1, in which case is a duplicate.

```bash
mvn exec:java -Dexec.mainClass="com.epam.task.FindDuplicates"
```
2. Factorial

This program creates a collection from a number using the Stream API.
Then apply a reduce() command to compute a multiplication for every
number in the collection.

```bash
mvn exec:java -Dexec.mainClass="com.epam.task.Factorial"
```
3. SecondLargest.

This program just sort an array of numbers and then pick the second greatest.

```bash
mvn exec:java -Dexec.mainClass="com.epam.task.SecondLargest"
```
4. GroupWords.

This program sort an array of strings using the command sorted()
of the Stream API. Then just print the output in the console.

```bash
mvn exec:java -Dexec.mainClass="com.epam.task.GroupWords"
```
5. PrimeNumbers.

This program found prime numbers in a range of numbers (ex: 1 - 20).
Using streams, filter any prime number. To identify a prime number,
it use a special method which validate if a number is divisible by any
other number greater than 2.

```bash
mvn exec:java -Dexec.mainClass="com.epam.task.PrimeNumbers"
```
