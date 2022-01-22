package com.samsung.thread.sync;

public class RightBracketPrinter extends BracketPrinter {

    public RightBracketPrinter(Object monitor, RunHistory runHistory) {
        super(monitor, runHistory);
        bracket = "]";
        order = 3;
    }
}
