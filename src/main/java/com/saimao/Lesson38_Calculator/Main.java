package com.saimao.Lesson38_Calculator;
/*
1. Method return type
2. Method name
3. Method parameter
4. Method body
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.add(1, 2);
        int subtraction = calculator.subtract(1, 2);
        int multiplication = calculator.multiply(2, 2);
        double division = calculator.divide(1.0, 2);
        System.out.printf("Addition - %d%nSubtraction - %d%nMultiplication - %d%nDivision %.2f%n", addition, subtraction, multiplication, division);
    }
}
