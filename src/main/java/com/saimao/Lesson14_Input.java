package com.saimao;

import java.util.Scanner;

public class Lesson14_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = sc.next();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("Your name is " + input);
        System.out.println("You are " + age + " years old");
    }
}
