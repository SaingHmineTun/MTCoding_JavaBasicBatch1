package com.saimao;
/*
Work like assignment operator
Syntax : boolean ? trueValue : falseValue;
 */
public class Lesson12_TernaryOperator {
    public static void main(String[] args) {
        boolean isMale = true && false;
        String name = isMale ? "Mr" : "Mrs";
        int even = isMale ? 0 : 1;
        System.out.println(name);
    }
}
