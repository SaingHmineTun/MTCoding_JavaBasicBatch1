package com.saimao.Lesson35_Method_Return_Type;

public class Main {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        math.firstNumber = 15;
        math.secondNumber = 15;
        math.printInfo();
        System.out.println(math.isSimilar());
    }
}
