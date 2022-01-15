package com.samsung.thread;

import java.util.concurrent.TimeUnit;

public class ParallelPrint {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.print("[");
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.print("]");
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();
        t2.join(); //

        while (true) {
            System.out.print("*");
            TimeUnit.MILLISECONDS.sleep(300);
        }
        // System.out.println("Main thread finish work");

    }
}
