package com.saimao.Lesson53_StaticInnerClass;

public class Person {
    private String name;
    private int age;

    private Person() {
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

    public static class PersonBuilder {

        private String name;
        private int age;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setName(name);
            person.setAge(age);
            return person;
        }

    }

}
