package com.saimao.Lesson58_Singleton;

public class Main {
    public static void main(String[] args) {
        Person one = Person.getInstance();
        Person two = Person.getInstance();
        System.out.println(one + " : " + two);
        System.out.println(one == two);
    }
}
