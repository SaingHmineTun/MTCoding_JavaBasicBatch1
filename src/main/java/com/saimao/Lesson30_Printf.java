package com.saimao;

public class Lesson30_Printf {
    public static void main(String[] args) {
        // print (print)
        // printLn (print and go next line)
        // printf (print and format)
        String name = "Sai";
        double age = 18;
        char ka = 'a';
        System.out.println("Hello " + name + ". You're " + age + " years old!");
        System.out.printf("Hello %s. You're %f years old!", name, age);
    }
}
