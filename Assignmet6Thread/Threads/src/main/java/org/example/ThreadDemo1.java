package org.example;

import static org.example.ThreadColour.ANSI_GREEN;

public class ThreadDemo1 extends Thread{

    @Override
    public void run(){
        System.out.println(ANSI_GREEN+"Hello from ThreadDemo1 class thread");

    }
}
