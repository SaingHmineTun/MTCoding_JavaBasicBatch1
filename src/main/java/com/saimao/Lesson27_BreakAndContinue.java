package com.saimao;

public class Lesson27_BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                continue; // skip
            }
            System.out.println(i);
            if (i == 20) {
                break;
            }
        }
    }
}
