package com.saimao;

import java.util.Scanner;

public class Lesson15_1_ArrayCreation {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // {10, 20, 30, 40, 50}
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers.length);

        var sc = new Scanner(System.in);
        sc.nextLine();
    }
}
