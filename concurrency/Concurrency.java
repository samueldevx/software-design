package com.example.concurrency;

public class Concurrency {

    public static void main(String[] args) throws InterruptedException {
        getNumberOfCores();
        int counter = 0;
        while (true) {
            System.out.println("Hi "+counter++);
            getActiveThreadCount();
            Thread.sleep(100);
        }
    }
    public static void getActiveThreadCount(){
        System.out.println("Active threads count " + Thread.activeCount());
    }
    public static void getNumberOfCores(){
        System.out.println("Number of CPU Cores "+Runtime.getRuntime().availableProcessors());
    }
}
