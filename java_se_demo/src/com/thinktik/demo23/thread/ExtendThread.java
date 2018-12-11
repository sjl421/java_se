package com.thinktik.demo23.thread;

/**
 * 继承Thread
 * <p>
 * 步骤：
 * 1,继承Thread 写出一个线程类
 * 2,重写run方法
 * 3,将要执行的代码写在run方法中
 * 4,new 一个线程类
 * 5,执行start()方法启动线程
 *
 * @author think
 */

public class ExtendThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        thread1.start();
        thread2.start();
        // 会看到A B交替输出
    }
}
// 继承出一个线程类
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyThread  --> " + name + i);
        }
    }
}
