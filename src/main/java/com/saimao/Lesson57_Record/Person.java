package com.saimao.Lesson57_Record;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.name.equals(person.name) && this.age == person.age;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.age;
    }
}
