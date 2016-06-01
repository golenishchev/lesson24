package com.example.lesson23;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start discussion...");

        IntellijUser intellijUserPhrase = new IntellijUser();
        intellijUserPhrase.start();

        Thread eclipseUserPhrase = new Thread(new EclipseUser());
        eclipseUserPhrase.start();
    }
}