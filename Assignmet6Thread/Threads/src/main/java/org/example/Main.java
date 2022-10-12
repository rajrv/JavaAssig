package org.example;

import static org.example.ThreadColour.ANSI_BLUE;
import static org.example.ThreadColour.ANSI_RED;

public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_RED+"Hello from main Thread!");
        Thread t_ob1= new ThreadDemo1();
        t_ob1.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_BLUE+"Hello from anonymous class thread");
            }
        }.start();

        Thread t_ob2 = new Thread(new MyRunnableThread());
        t_ob2.start();

        System.out.println(ANSI_RED+"Hello from main thread again!");
    }
}