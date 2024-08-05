package com.saimao.Lesson77_JavaStream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1. methods return stream => intermediate methods
2. methods return others => terminate methods
 */
public class Main {
    public static void main(String[] args) {

        // 1. Stream<Integer> nums = Stream.of(1,2,3,4,5);
        // 2. Stream<Object> nums = Stream.builder().add(1).add(2).add(3).add(4).add(5).build();
        List<Integer> list = List.of(5, 50, 22, 4, 8, 6, 12, 8, 32, 10);

        // Before Stream
//        List<Integer> output = new ArrayList<>();
//        for (int i : list) {
//            if (i % 2 == 0) output.add(i * 10);
//        }

        // Filter, Map, Sorted, To List
        List<Integer> output = list.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * 10).sorted().collect(Collectors.toList());

        // For Each
        list.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * 10).sorted().forEach(i -> System.out.println(i));

        // Reduce
        int sum = list.stream().reduce((integer, integer2) -> integer * integer2).get();
        System.out.println(sum);


    }
}
