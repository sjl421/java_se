package com.thinktik.demo23.thread;

/**
 * @author think
 * 2018年3月4日下午6:55:48
 * 实现多线程的第一种方法:继承Thread类
 *
 * 多运行几次，会看到交叉出现ExtendThread的输出和主线程的输出
 */
public class ExtendThreadRun {
    public static void main(String[] args) {
        ExtendThread thread1 = new ExtendThread("A");
        ExtendThread thread2 = new ExtendThread("B");
        thread1.start();
        thread2.start();
    }
}
