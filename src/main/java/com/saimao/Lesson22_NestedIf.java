package com.saimao;

import java.util.Scanner;

public class Lesson22_NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student grade between 1 and 10");
        int studentGrade = sc.nextInt();

        if (studentGrade > 0 && studentGrade <= 10) {
            // Valid
            if (studentGrade <= 4) { // under 4
                System.out.println("Go to primary school!");
            } else if (studentGrade <= 8) { // between 4 and 8
                System.out.println("Go to middle school!");
            } else if (studentGrade == 9) {
                System.out.println("Go to high school!");
            } else {
                System.out.println("Go to Headmaster office!");
            }

        } else {
            System.out.println("Invalid Input!");
        }

    }


}

/*
serverEmail -> sai@gmail.com (String)
serverPassword -> 1234 (int)

readUserEmail
readUserPassword

if (serverEmail = readUserEmail and serverPassword = readUserPassword) =>
LOGIN SUCCESS => sai/mg => Hello Mr | nang/ma => Hello Mrs | Hello User

serverEmail = readUserEmail but serverPassword != readUserPassword =>
INCORRECT PASSWORD

serverEmail != readUserEmail but serverPassword = readUserPassword =>
INCORRECT EMAIL

serverEmail != readUserEmail and serverPassword != readUserPassword =>
LOGIN FAILED!
 */
