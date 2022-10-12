package org.example;
import java.util.concurrent.*;

class CallableMessage implements Callable<String>{
    public String call() throws Exception
    {
        return "Hello World!";
    }
}
class RunnableImpl implements Runnable {

    public void run()
    {
        System.out.println("Hello World from a different thread than Main");
    }
}

public class CallableRunable{
    static ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws Exception
    {
        CallableMessage task = new CallableMessage();
        Future<String> message = executor.submit(task);
        System.out.println(message.get().toString());

        RunnableImpl task1 = new RunnableImpl();
        Thread thread = new Thread(task1);
        thread.start();
        // Creating and running runnable task using Executor Service.
        executor.submit(task1);
    }
}