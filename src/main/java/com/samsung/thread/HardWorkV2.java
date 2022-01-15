package com.samsung.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class HardWorkV2 {

    public static AtomicLong result = new AtomicLong();
    public static AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        int dif = 2000000000 / 4;
        int start = 1;
        Thread[] threads = new Thread[4];
        CalcRunner[] runners = new CalcRunner[4];
        Object monitor = new Object();
        for (int i = 0; i < 4; i++) {
            runners[i] = new CalcRunner(start, start + dif, monitor);
            start += dif;
            threads[i] = new Thread(runners[i]);
            threads[i].start();
        }
        while (counter.get() < 4) {
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Processed by " + (end - begin) + " ms.");
    }
}
