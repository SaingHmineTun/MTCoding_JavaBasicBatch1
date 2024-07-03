package com.saimao.Lesson42_MethodOverriding;

public class Sub extends Super {

    public double income = 50_000;

    public void printIncome() {
        System.out.println("Super income - " + super.income);
        System.out.println("Sub income - " + income);
    }
}
