package com.thinktik.demo23.threadmethod;

/**
 * 当前线程
 */
public class ThreadCurrentThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "...Thread01");
            }
        }.start();


        new Thread(() -> {
            //Thread.currentThread()获取当前正在执行的线程
            System.out.println(Thread.currentThread().getName() + "...Thread02");
        }).start();

        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }

}
