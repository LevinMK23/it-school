package com.samsung.thread.sync;

import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();
        RunHistory runHistory = new RunHistory();
        runHistory.setMon(monitor);
        runHistory.setLock(new ReentrantLock());
        new Thread(new LeftBracketPrinter(monitor, runHistory)).start();
        new Thread(new RightBracketPrinter(monitor, runHistory)).start();
        new Thread(new TriangleBracketPrinter(monitor, runHistory)).start();
//        long start = System.currentTimeMillis();
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                runHistory.incrementOrder();
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                runHistory.incrementOrder();
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//
//        long finish = System.currentTimeMillis();
//        System.out.println("order: " + runHistory.getCurrentOrder());
//        System.out.println("time: " + (finish - start));
    }

}
