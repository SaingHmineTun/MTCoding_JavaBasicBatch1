package com.saimao.Lesson67_Synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.init();
    }

    private int counter;

    private synchronized void increaseCounter() {
        counter++;
    }

    private void incCounter() {
        synchronized (this) {
            counter++;
        }
    }


    private void init() throws InterruptedException {

        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 500000; i++) {
                    incCounter();
                }
            }
        }

        Thread th1 = new Worker();
        th1.start();

        Thread th2 = new Worker();
        th2.start();

        Thread th3 = new Worker();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        System.out.println(counter);

    }
}
