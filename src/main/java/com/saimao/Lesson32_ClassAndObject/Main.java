package com.saimao.Lesson32_ClassAndObject;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Sai Sai";
        person.age = 18;
        person.male = true;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.male);

        System.out.println("#######################");

        Person sai = new Person();
        System.out.println(sai.name); // null
        System.out.println(sai.age); // 0
        System.out.println(sai.male); // false


    }
}
