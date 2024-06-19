package com.saimao;

import java.util.Scanner;

public class Lesson31_UnicodeCharacter {
    public static void main(String[] args) {
        System.out.println("Enter integer value!");
        int i = new Scanner(System.in).nextInt(); // 4096
        System.out.printf("Integer value - %d%n", i);
        System.out.printf("Character value - %c%n", i); // int -> character
        System.out.printf("Octal value - %o%n", i); // int -> octal value
        System.out.printf("Hexadecimal value - %x%n", i); // int -> hexa value


    }
}
/*
input your integer number - 4096
character - က
hexa - 1000
octal - 10000
decimal - 4096
 */
