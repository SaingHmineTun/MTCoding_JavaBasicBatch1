package com.saimao.Lesson77_JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 4, 3, 10, 7, 6, 9, 8);

        //Loop list with stream
        list.stream().forEach(i -> {
            System.out.println(i);
        });

        // using filter intermediate operation
        list.stream().filter(i -> i <= 5).forEach(System.out::print);

        // using map intermediate operation
        List<Integer> doubleList = list.stream().map(i -> i * 10).toList();
        doubleList.forEach(System.out::println);

        // using sorted
        List<Integer> sortedList = doubleList.stream().sorted().toList();
        sortedList.forEach(System.out::println);

        int sum = doubleList.stream().reduce((x, y) -> x + y).get();

        sum = 0;
        for (int i: sortedList) {
            sum += i;
        }

        System.out.println(sum);


    }
}
