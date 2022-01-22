package com.samsung.thread.sync;

public class BracketPrinter implements Runnable {

    protected int order;
    private final Object monitor;
    protected String bracket;
    private final RunHistory runHistory;

    public BracketPrinter(Object monitor,
                          RunHistory runHistory) {
        this.monitor = monitor;
        this.runHistory = runHistory;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (monitor) {
                    if (order == runHistory.getCurrentOrder()) {
                      //  monitor.notify();
                        System.out.print(bracket);
                        runHistory.incrementOrder();
                       // monitor.wait();
                    }
                }
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
