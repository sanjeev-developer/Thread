package com.lambton;

public class FireClass {

    public static void main(String args[]) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        RunnableExample runnableExample = new RunnableExample();
        t1.start();
        t2.start();
        runnableExample.run();
    }
}
