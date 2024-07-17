package com.saimao;

public class Lesson65_ImplementingRunnableInterface {
    public static void main(String[] args) {

        System.out.println("Start main");

        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
                System.out.println("Seconds : " + i);
            }
        });
        thread.start();

        System.out.println("End main");

    }
}
