package com.samsung.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HardWork {

    static long hardCalc(int from, int to) {
        long x = from;
        for (int i = from + 1; i < to; i++) {
            x += i;
        }
        return x;
    }

    static long result = 0;

    public static void main(String[] args) throws InterruptedException {
        long s = System.currentTimeMillis();
        long res = hardCalc(1, 2000000001);
        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println("Processed by: " + (end - s) + " ms.");
//
        // 321730049
       // long result = 0;
        int dif = 2000000000 / 4;
        int start = 1;
        Thread[] threads = new Thread[4];
        CalcRunner[] runners = new CalcRunner[4];
        s = System.currentTimeMillis();
        for (int i = 0; i < 4; i++) {
            runners[i] = new CalcRunner(start, start + dif, new Object());
            start += dif;
            threads[i] = new Thread(runners[i]);
            threads[i].start();
            // Thread.sleep(1000);
            //result += runners[i].getResult();
        }

        Set<Thread> queue = new HashSet<>();
        Map<Thread, CalcRunner> runnerMap = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            queue.add(threads[i]);
            runnerMap.put(threads[i], runners[i]);
        }

        Thread t3 = new Thread(() -> {
            while (!queue.isEmpty()) {
                Iterator<Thread> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    Thread thread = iterator.next();
                    if (thread.getState() == Thread.State.TERMINATED) {
                        long r = runnerMap.get(thread).getResult();
                        result += r;
                        iterator.remove();
                    }
                }
            }
        });
        t3.start();
        t3.join();
        end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Processed by: " + (end - s) + " ms.");

    }

}
