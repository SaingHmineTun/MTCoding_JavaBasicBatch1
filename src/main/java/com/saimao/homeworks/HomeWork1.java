package com.saimao.homeworks;

import java.util.Scanner;
/*
HOMEWORK #1
String serverEmail = "sai@gmail.com";
int serverPassword = 12345;

request email
request password
if requested email matches serverEmail and requested password matches serverPassword then print LOGIN SUCCESS
else print LOGIN FAILED!
 */

public class HomeWork1 {
    public static void main(String[] args) {

        String serverEmail = new String("sai@gmail.com");
        int serverPassword = 12345;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println("Enter your password");
        int password = sc.nextInt();

        String message = serverEmail.equals(email) && serverPassword == password
                ? "LOGIN SUCCESS!" : "LOGIN FAILED";
        System.out.println(message);

    }
}
