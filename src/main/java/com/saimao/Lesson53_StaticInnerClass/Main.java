package com.saimao.Lesson53_StaticInnerClass;

public class Main {
    public static void main(String[] args) {

        // Declarative style
        Person person = new Person.PersonBuilder().setName("Sai Sai").setAge(18).build();
    }
}
