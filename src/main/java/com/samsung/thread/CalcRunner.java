package com.samsung.thread;

public class CalcRunner implements Runnable {

    private final int from, to;
    private final Object monitor; // null
    private long result;

    public CalcRunner(int from, int to, Object monitor) {
        this.from = from;
        this.to = to;
        this.monitor = monitor;
        System.out.printf("from = %d, to = %d\n", from, to);
    }


    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {

        System.out.println("Run start in " + Thread.currentThread().getName());
        long x = from;
        for (int i = from + 1; i < to; i++) {
            x += i;
        }

        HardWorkV2.result.addAndGet(x);
        HardWorkV2.counter.incrementAndGet();

        System.out.println("Thread: " + Thread.currentThread().getName() + " finish with result: " + x);
        System.out.println("Counter: " + HardWorkV2.counter + ", result: " + HardWorkV2.result);
    }
}
