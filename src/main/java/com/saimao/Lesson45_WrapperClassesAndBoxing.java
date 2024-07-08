package com.saimao;

public class Lesson45_WrapperClassesAndBoxing {
    public static void main(String[] args) {

        int i = 35; // primitive
        printValue(i);
        Integer ii = i; // auto-boxing
        int iii = ii; // unboxing
    }

    public static void printValue(Object object) {
        System.out.println(object);
    }

}
