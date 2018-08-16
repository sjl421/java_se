package com.thinktik.demo23.threadmethod;

public class ThreadDemo07 {
    public static void main(String[] args) {
        System.out.println("主线程ID:" + Thread.currentThread().getId());
        MyThread07 thread01 = new MyThread07();
        thread01.start();
        MyThread07 thread02 = new MyThread07();
        thread02.start();
        MyThread07 thread03 = new MyThread07();
        thread03.run();//thread03和主线程ID相同,通过run方法调用并不会创建新的线程，而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
    }
    
    static class MyThread07 extends Thread {
        private static int num = 0;
        
        public MyThread07() {
            num++;
        }
        
        @Override public void run() {
            try {
                Thread.currentThread().sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("num:" + num + " 子线程ID:" + Thread.currentThread().getId());
        }
    }
}
