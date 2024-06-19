package com.saimao.Lesson35_Method_Return_Type;

/*
1. Method return type
2. Method name
3. Method parameter
4. Method body
 */
public class Mathematics {
    int firstNumber;
    int secondNumber;

    void printInfo() {
        System.out.printf("First number - %d%nSecond number - %d%n", firstNumber, secondNumber);
    }

    int getFirstNumber() {
        System.out.println("Fetching first number...");
        return firstNumber;
    }

    int add() {
        return firstNumber + secondNumber;
    }

    int subtract() {
        return firstNumber - secondNumber;
    }

    int multiply() {
        return firstNumber * secondNumber;
    }

    int divide() {
        return firstNumber / secondNumber;
    }

    boolean isSimilar() {
        return firstNumber == secondNumber;
    }


}
