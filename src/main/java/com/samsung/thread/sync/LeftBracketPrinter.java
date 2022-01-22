package com.samsung.thread.sync;

public class LeftBracketPrinter extends BracketPrinter {

    public LeftBracketPrinter(Object monitor, RunHistory runHistory) {
        super(monitor, runHistory);
        bracket = "[";
        order = 1;
    }
}
