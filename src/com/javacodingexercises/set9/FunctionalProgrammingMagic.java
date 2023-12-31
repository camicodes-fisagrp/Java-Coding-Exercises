package com.javacodingexercises.set9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Optional;
public class FunctionalProgrammingMagic {

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        // Write your code here
        return numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
    }

    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        return IntStream.range(1, n + 1).map(number -> number * number * number)
                .boxed()
                .collect(Collectors.toList());
    }
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        // TODO: Write code
        if (courses == null) {
            return List.of();
        }

        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
    public static long sumOfSquares(List<Integer> numbers) {
        // Check if the list is null. If so, return 0.
        // Stream over the list of numbers, find squares and sum them up
        if (numbers == null){
            return 0;
        }
        return numbers.stream().mapToLong(number -> number * number).sum();
    }
    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if (numbers == null){
            return 0;
        }

        Optional<Integer> maxEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .max(Integer::compare);
        return maxEven.orElse(0);
    }
}