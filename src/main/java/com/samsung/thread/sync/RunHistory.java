package com.samsung.thread.sync;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class RunHistory {

    // 1 2 3 -> 1
    private AtomicInteger currentOrder;
    private int cnt;
    private Object mon;
    private Lock lock;

    public RunHistory() {
        currentOrder = new AtomicInteger();
        cnt = 1;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public void setMon(Object mon) {
        this.mon = mon;
    }

    public int getCurrentOrder() {
        return cnt;
    }

    public void incrementOrder() {
        // lock.lock();
        //currentOrder.incrementAndGet();
        cnt++;
        // lock.unlock();
        if (cnt > 3) {
            cnt = 1;
        }
    }

}
