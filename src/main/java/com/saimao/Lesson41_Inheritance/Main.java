package com.saimao.Lesson41_Inheritance;

import com.saimao.Lesson41_Inheritance.children.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.expense(5000);
        child.printIncome();
    }
}
