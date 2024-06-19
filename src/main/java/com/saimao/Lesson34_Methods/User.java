package com.saimao.Lesson34_Methods;

import com.saimao.Lesson33_ArrayOfObjects.FoodMenu;

/*
1. Method return type
2. Method name
3. Method parameter
4. Method body
 */
public class User {
    String name;
    int age;

    void printInfo() {

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old!");

    }

    void printName() {

        System.out.println("Your name is " + name);
    }

    void printAge() {

        System.out.println("You are " + age + " years old!");
    }


}
