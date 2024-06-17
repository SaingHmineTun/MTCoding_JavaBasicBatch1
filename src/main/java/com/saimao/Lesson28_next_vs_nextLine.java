package com.saimao;

import java.util.Scanner;

public class Lesson28_next_vs_nextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        System.out.println(age);

        // Using nextLine will not request the input
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
