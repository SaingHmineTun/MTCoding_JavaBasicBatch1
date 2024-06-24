package com.saimao.Lesson39_Constructor;

/*
1. No return type
2. Name must be class name
 */
public class User {
    String name;
    int age;

    User() {

    }

    User(String name) {
        this.name = name;
    }

    User(int age) {
        this.age = age;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void printInfo() {
        System.out.printf("Name - %s%nAge - %d%n", this.name, age);
    }

}
