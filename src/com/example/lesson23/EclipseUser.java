package com.example.lesson23;

public class EclipseUser implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                //Sleep for 1 sec
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Eclipse is better!");
        }
    }
}
