package com.thinktik.demo23.thread;


/**
 * 实现Runnable接口
 * 步骤：
 *     1,定义一个类实现Runnable
 *     2,重写run方法
 *     3,将要执行的代码写在run方法中
 *     4,new 一个线程类传入Thread类实例中
 *     5,执行start()方法启动Thread类实例
 *
 * @author think
 */
public class ImplRunnable{
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("A");
        MyRunnable runnable2 = new MyRunnable("B");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        // 会看到A B交替输出
    }
}

// 实现Runnable接口
class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ImplRunnable --> "+name + i);
        }
    }
}


