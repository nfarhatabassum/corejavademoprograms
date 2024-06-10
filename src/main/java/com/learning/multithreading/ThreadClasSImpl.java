package com.learning.multithreading;

public class ThreadClasSImpl extends Thread{
    public void run(){
        for (int i=1;i<10;i++){
            System.out.println("Thread "+Thread.currentThread().getName()+" value of i "+i);
        }
    }

    public static void main(String[] args) {
        ThreadClasSImpl thread1 = new ThreadClasSImpl();
        ThreadClasSImpl thread2 = new ThreadClasSImpl();
        ThreadClasSImpl thread3 = new ThreadClasSImpl();
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
