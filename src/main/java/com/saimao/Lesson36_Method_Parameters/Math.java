package com.saimao.Lesson36_Method_Parameters;

public class Math {
    int firstNumber;
    int secondNumber;

    // parameter
    int add(int i) {
        System.out.println(i);
        return i;
    }

    void setData(int fn, int sn) {
        firstNumber = fn;
        secondNumber = sn;
    }

    void printData() {
        System.out.printf("First number - %d%nSecond number - %d%n", firstNumber, secondNumber);
    }

}
