package org.example;

import static org.example.ThreadColour.ANSI_PURPLE;

public class MyRunnableThread implements Runnable{
    @Override
    public void run(){
        System.out.println(ANSI_PURPLE+"Hello from Runnable Thread");

    }
}
