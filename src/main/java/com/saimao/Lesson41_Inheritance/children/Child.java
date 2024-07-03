package com.saimao.Lesson41_Inheritance.children;

import com.saimao.Lesson41_Inheritance.parents.Parent;

public class Child extends Parent {
    public void expense(double amount) {
        income -= amount;
    }

    public void deposit(double amount) {
        income += amount;
    }
}
