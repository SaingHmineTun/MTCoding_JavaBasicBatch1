package com.saimao.Lesson63_CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter number between 1 and 6");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1 || number > 6) {
            throw new InvalidNumberException("You entered invalid number");
        } else {
            System.out.println("Number : " + number);
        }
    }
}
