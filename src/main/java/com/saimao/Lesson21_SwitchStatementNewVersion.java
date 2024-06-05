package com.saimao;

/*
static type programming
 */
public class Lesson21_SwitchStatementNewVersion {
    public static void main(String[] args) {
        var studentName = "Ma"; // inference data type
        switch (studentName) {
            case "Ma", "Nang" -> {
                System.out.println("You're a girl");
            }
            case "Mg", "Sai" -> {
                System.out.println("You're a boy");
            }
            default -> {
                System.out.println("I don't know!");
            }
        }
    }
}
