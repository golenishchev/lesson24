package com.example.lesson24;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MessageLoop());
        System.out.println(Thread.currentThread().getName() + ": " + "Старт MessageLoop thread");
        System.out.println(Thread.currentThread().getName() + ": " +
                "Жду пока MessageLoop thread закончит свое исполнение");
        // should I place message about thread start before or after start() method?
        thread.start();
        while (thread.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            //thread.join();
            System.out.println(Thread.currentThread().getName() + ": " + "Я жду...");
        }
        System.out.println(Thread.currentThread().getName() + ": " + "Конец!");
    }
}
