package com.thinktik.demo23.thread;

public class MyRunnable implements Runnable {
    //1,定义一个类实现Runnable
    //2,重写run方法
    //3,将要执行的代码写在run方法中
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyRunnable   " + i);
        }
    }

}
