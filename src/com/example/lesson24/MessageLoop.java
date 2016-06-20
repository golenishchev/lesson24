package com.example.lesson24;

public class MessageLoop implements Runnable {
    Thread thread;

    private String[] messagesArray = {"Первая строка из массива,", "Вторая строка из массива,",
            "Третья строка из массива,"};

    public void run() {
        thread = new Thread (this, "Thread-0");
        for (int i = 0; i < messagesArray.length; i++) {
            try {
                Thread.sleep(4000);
            } catch ( InterruptedException e){

            }
            System.out.println(thread.getName() +": " + messagesArray[i]);
        }
    }
}
 