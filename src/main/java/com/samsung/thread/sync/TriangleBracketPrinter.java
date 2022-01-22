package com.samsung.thread.sync;

public class TriangleBracketPrinter extends BracketPrinter {

    public TriangleBracketPrinter(Object monitor, RunHistory runHistory) {
        super(monitor, runHistory);
        bracket = "^";
        order = 2;
    }
}
