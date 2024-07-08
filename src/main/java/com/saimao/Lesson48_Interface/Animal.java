package com.saimao.Lesson48_Interface;

public interface Animal {
    void makeSound();

    default void print() {
        System.out.println("Hello, Animal");
    }

}
