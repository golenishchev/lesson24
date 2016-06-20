package com.example.lesson24;

//import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        MessageLoop myMessageLoop = new MessageLoop();
        System.out.println("Старт MessageLoop thread");
        myMessageLoop.run();
        while (thread.isAlive()) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            //myMessageLoop.join();
            System.out.println(thread.getName() + ": " + "Я жду...");
        }
    }
}
