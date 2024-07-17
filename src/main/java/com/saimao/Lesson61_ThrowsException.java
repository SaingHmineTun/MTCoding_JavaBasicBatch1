package com.saimao;

public class Lesson61_ThrowsException {
    public static void main(String[] args) {
        System.out.println("Before sleep");
        try {
            sleepFor1Sec();
        } catch (InterruptedException e) {
            System.out.println("cannot sleep!");
        }
        System.out.println("After sleep!");
    }

    public static void sleepFor1Sec() throws InterruptedException {
        Thread.sleep(1000);
    }

}
