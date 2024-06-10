package com.saimao;

public class Lesson26_LoopArray {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int[] numbers = {2, 4, 5, 6, 8, 10};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
