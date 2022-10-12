package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsnewSingleThreadExecutor {
    public static void main(String[] args) {
        System.out.println("current thread : " + Thread.currentThread().getName());

        System.out.println(" Executor Service...");
        ExecutorService ex  = Executors.newSingleThreadExecutor();

        System.out.println("Runnable...");
        Runnable runnable = () -> {
            System.out.println(":: " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task ");
        ex.submit(runnable);
    }
}