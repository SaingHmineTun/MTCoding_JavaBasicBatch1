package com.saimao.Lesson40_AccessModifierAndEncap.models;

public class User {
    private String name;
    private int age;

    // Write access
    public void setAge(int age) {
        if (age > 0 && age < 150) this.age = age;
    }

    // Read access
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
