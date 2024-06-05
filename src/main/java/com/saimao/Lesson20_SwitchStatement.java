package com.saimao;

import java.util.Scanner;

/*
switch (value) {
    case value:
        break;
    default:
        break;
}
 */
public class Lesson20_SwitchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int studentGrade = sc.nextInt();

        switch (studentGrade) {
            case 1, 2, 3, 4:
                System.out.println("Go to primary school!");
                break;
            case 5, 8, 7, 6:
                System.out.println("Go to middle school!");
                break;
            case 9:
                System.out.println("Go to high school!");
                break;
            default:
                System.out.println("Go to headmaster office");
                break;
        }

    }
}
