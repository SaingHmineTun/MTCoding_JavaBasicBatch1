package com.saimao;

public class Lesson60_ExceptionHandlingWithTryCatch {
    public static void main(String[] args) {
        // Checked exception
        System.out.println("Before sleep");
        try {
            Thread.sleep(1000); // 1000 milliseconds = 1 second
            int num = 10 / 0;
        } catch (InterruptedException e) {
            System.out.println("Cannot sleep");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("After sleep");
        }


    }
}
