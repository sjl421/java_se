package com.thinktik.demo23.threadmethod;

public class ThreadYield {

    /**
     * yield让出cpu礼让线程
     */
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
    
    static class  MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 1000; i++) {
                if (i % 10 == 0) {
                    Thread.yield();                        //让出CPU
                }
                System.out.println(getName() + "..." + i);
            }
        }
    }

}
