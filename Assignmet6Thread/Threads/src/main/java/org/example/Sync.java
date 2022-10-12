package org.example;

public class Sync {

    public static void main(String args[]) throws InterruptedException {

        Table ob = new Table();

        Mythread t1 = new Mythread(8,ob);
        Mythread t2 = new Mythread(9,ob);
        t1.start();
        t2.start();




    }

}
class Mythread extends Thread {
    int num;
    Table ob;

    Mythread(int num,Table ob) {
        this.num = num;
        this.ob = ob;

    }

    @Override
    public void run() {
        try {
            ob.printTableSynchronizedBlock(num);

            ob.printTableSynchronizedMethod(num);
        } catch (Exception e) {

        }

    }
}

class Table
{
    synchronized public  void printTableSynchronizedMethod(int num) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" is running multiplication table of "+num+" with SynchronizedMethod:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+ i+" = "+num*i);
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
    }
    public void printTableSynchronizedBlock(int num) throws InterruptedException {
      synchronized (this) {
            System.out.println("Synchronized Block:" + Thread.currentThread().getName() + " is running multiplication table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
                Thread.sleep(1000);
            }
        }

    }
}
