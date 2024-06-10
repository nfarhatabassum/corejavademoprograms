package com.learning.multithreading;

public class RunnableImpl implements Runnable{

@Override
public void run() {
        System.out.println("Runnable Implementation");
        }

    public static void main(String[] args) {
        RunnableImpl threadRunnable = new RunnableImpl();
        Thread t1 = new Thread(threadRunnable);
        t1.start();
    }

}