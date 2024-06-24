package com.saimao.Lesson37_MethodOverloading;

/*
1. Number of parameters
2. Parameter data type
 */
public class Console {
    void print() {
        System.out.println("Hello World");
    }

    void print(String name) {
        System.out.println("String - " + name);
    }

    void print(int number) {
        System.out.println("Number - " + number);
    }

    void print(String name, int number) {
        System.out.printf("String and Number - %s and %d", name, number);
    }

    void print(int number, String name) {
        System.out.printf("Number and String - %d and %s", number, name);
    }

}
