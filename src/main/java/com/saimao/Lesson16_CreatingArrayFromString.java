package com.saimao;
/*
split method transforms String to String Array
 */
public class Lesson16_CreatingArrayFromString {
    public static void main(String[] args) {
        String introduction = "Hello, how are you?";
        String[] array = introduction.split(" ");
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[array.length - 1]);
    }
}
