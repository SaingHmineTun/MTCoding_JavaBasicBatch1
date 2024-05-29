package com.saimao;

public class Lesson13_StringMethods {

    public static void main(String[] args) {
        String name = "Sai Sai";
        int length = name.length();
        System.out.println("Length of my name is " + length);
        System.out.println("Lowercase : " + name.toLowerCase());
        String upper;
        upper = name.toUpperCase();
        System.out.println("Uppercase : " + upper);

        String password = "       ";
        boolean empty = password.isEmpty();
        System.out.println("Is Empty : " + empty);
        System.out.println("Is Blank : " + password.isBlank());

        /*
        equals
        startsWith
        endsWith
        contains
         */
        String first = new String("Sai"); // String Pool
        String second = new String("Saa");
        boolean isEqual = first.equals(second);
        System.out.println("Is Equal : " + isEqual);
        boolean startsWith = first.startsWith(second);
        System.out.println("Starts With : " + startsWith);
        System.out.println("Ends With : " + first.endsWith("ai"));
        System.out.println("Contains : " + first.contains("aii"));
    }
}
