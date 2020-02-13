package com.company;

public class Runner extends Thread {
    String r1 = "runner1";
    String r2 = "runner2";
    String r3 = "runner3";
    String r4 = "runner4";
    String r5 = "runner5";


    @Override
    public  void run() {
        super.run();
         try {
             System.out.printf(r1 + " передает эстафету " +r2+"\n");
             join();

             System.out.println(r2 +" передает эстафету " + r3);
             join();

             System.out.println(r3 + " передает эстафету " + r4);
             join();

             System.out.println(r4 + " передает эстафету " + r5);
             join();

             System.out.println(r5 + " передает эстафету " + r4);
             join();

             System.out.println(r4 + " передает эстафету " + r3);
             join();

             System.out.println(r3 + " передает эстафету " + r2);
             join();

             System.out.println(r2 + " передает эстафету " +r1);
             join();

             System.out.println(r1 + " прибежал к финишу " );
             join();



         } catch (InterruptedException e) {
                 e.printStackTrace();
             }


         }


    }










