package com.vsk.streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class StreamsFilterExample {

    public static void main(String[] args) {
        //Even numbers
        List<Integer> intList = Arrays.asList(1, 2, 100, 44, 999);
        intList.forEach(out::println);
        Predicate<Integer> isEven = val -> val %2 == 0;
        List<Integer> evenNumbers = intList.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        evenNumbers.forEach(out::println);

        //Names starting with vowels
        List<String> names = Arrays.asList("Gary", "Sammy", "Danny", "Angel", "Bill", "Oliver", "Anna");
        Predicate<String> startsWithVowel = name -> name.matches("^[AEIOU].*");
        List<String> namesStartingWithVowels = names.stream()
                .filter(startsWithVowel)
                .collect(Collectors.toList());
        namesStartingWithVowels.forEach(out::println);
    }
}
