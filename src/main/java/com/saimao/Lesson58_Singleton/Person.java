package com.saimao.Lesson58_Singleton;

public class Person {

    private static Person person;

    public static Person getInstance() {
        if (person == null) person = new Person();
        return person;
    }

    private String name;
    private int age;

    private Person() {
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
