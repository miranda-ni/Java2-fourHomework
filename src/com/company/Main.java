package com.company;

public class Main {


    public static void main(String[] args)  {
        Thread thread = new Thread();
        System.out.println("Старт " + thread.currentThread().getName());
         Thread r1 = new Thread(new Runner());
         Thread r2 = new Thread();
         Thread r3 = new Thread();
         Thread r4 = new Thread();
         Thread r5 = new Thread();
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
    }
}