package com.saimao.Lesson49_Static;

public class Main {

    String name = "Sai Sai";

    public void print() {

    }

    public static void main(String[] args) {
        Person.name = "Sai"; // Static variable can be accessed via class name
        Person.printName(); // Static method can be accessed vial class name

        Person person1 = new Person();
        person1.name = "Ko";
        person1.printName();

//        System.out.println(name); Static method cannot cal instance variable
//        print(); Static method cannot call instance method

    }
}
