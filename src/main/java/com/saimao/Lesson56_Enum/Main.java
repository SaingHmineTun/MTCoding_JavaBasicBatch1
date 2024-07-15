package com.saimao.Lesson56_Enum;

public class Main {
    public static void main(String[] args) {
        showPriority(Priority.LOW);
    }

    public static void showPriority(int i) {

        String[] priority = {"Low", "Medium", "High"};

        if (i > 0 && i < 4) {
            System.out.println(priority[i - 1]);
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void showPriority(Priority priority) {
        priority.printValue();
    }

}
