package com.example.lesson24;

public class MessageLoop implements Runnable {
    Thread thread;

    private String[] messagesArray = {"Первая строка из массива,", "Вторая строка из массива,",
            "Третья строка из массива,"};

    public void run() {
        thread = new Thread(this, "Thread-0");
        for (String aMessagesArray : messagesArray) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println(thread.getName() + ": " + aMessagesArray);
        }
    }
}
