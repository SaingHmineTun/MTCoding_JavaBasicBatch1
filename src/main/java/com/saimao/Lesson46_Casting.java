package com.saimao;

public class Lesson46_Casting {
    public static void main(String[] args) {

        String number = "123";
        int num = Integer.parseInt(number); // String to int
        System.out.println(num);

        String active = "TRUE";
        boolean bool = Boolean.parseBoolean(active); // String to boolean
        System.out.println(bool);

        String hello = "Hello";
        char ch = hello.charAt(2); // String to char
        System.out.println(ch);

        String.valueOf(num); // int to String
        String.valueOf(bool); // boolean to String
        String.valueOf(ch); // char to String


    }
}
