package com.example.lesson23;

public class IntellijUser extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                //Sleep for 1 sec
                sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("IDEA is better!");
        }
    }
}
