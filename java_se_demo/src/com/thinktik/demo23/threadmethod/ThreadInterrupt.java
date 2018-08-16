package com.thinktik.demo23.threadmethod;


public class ThreadInterrupt{
    
    public static void main(String[] args) {
        ThreadInterrupt test = new ThreadInterrupt();
        MyThread thread = test.new MyThread();
        thread.start();
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
        
        }
        thread.interrupt();
    }
    
    class MyThread extends Thread {
        @Override public void run() {
            try {
                System.out.println("进入睡眠状态");
                Thread.currentThread().sleep(10000);
                System.out.println("睡眠完毕");
            } catch (InterruptedException e) {
                System.out.println("得到中断异常");
            }
            System.out.println("run方法执行完毕");
        }
    }
}