package com.saimao;

public class Lesson15_Array {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] numbers = {100, 200, 300, 400, 500};
        String[] texts = {"Hello", "How", "Are", "You", "?", "B", "C", "DEF"};

        // Getting the length of array
        System.out.println(texts.length);
        System.out.println(texts);

        // Accessing value in array
        int number = numbers[2];
        System.out.println(number + numbers[4]);

        // Accessing first and last element in array
        System.out.println(texts[0]); // first element
        System.out.println(texts[texts.length - 1]); // last element

        // Updating element's value in array
        System.out.println("Before Updating : " + texts[4]);
        texts[4] = "A";
        System.out.println("After Updating : " + texts[4]);

        // Array Index out of bound
        // System.out.println(numbers[5]);

        // Array is immutable
        numbers[2] = 0;
        System.out.println(numbers.length);
    }
}
