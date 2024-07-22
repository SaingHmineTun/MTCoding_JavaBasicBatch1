package com.saimao.Lesson66_ThreadJoin;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Started");
        Thread th = new Thread(() -> {
            int i = 1;
            while (i <= 10) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Second : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        });
        th.start();
        th.join();
        System.out.println("Main Thread Ended!");

    }
}
