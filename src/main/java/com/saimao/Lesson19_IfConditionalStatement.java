package com.saimao;

import java.util.Scanner;

/*
Syntax : if (boolean_expression) { ... }
 */
public class Lesson19_IfConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student grade between 1 and 10");
        int studentGrade = sc.nextInt();
        // ternary
        if (studentGrade <= 4) { // under 4
            System.out.println("Go to primary school!");
        } else if (studentGrade >= 5 && studentGrade <= 8) { // between 4 and 8
            System.out.println("Go to middle school!");
        } else if (studentGrade == 9) {
            System.out.println("Go to high school!");
        } else {
            System.out.println("Go to Headmaster office!");
        }
    }
}
