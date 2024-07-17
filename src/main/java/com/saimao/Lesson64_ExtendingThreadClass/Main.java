package com.saimao.Lesson64_ExtendingThreadClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");
        class WorkerThread extends Thread {
            @Override
            public void run() {
                int i = 0;
                boolean b = true;
                while (b) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                    System.out.println(i);
                }
            }
        }
        WorkerThread workerThread = new WorkerThread();
        workerThread.start();
        System.out.println("End main");

    }
}
