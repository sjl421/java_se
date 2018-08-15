package com.thinktik.demo23.thread;

/**
 * @author think
 * 2018年3月4日下午6:55:48
 */

/*
 * 实现多线程的第一种方法:继承Thread类
 *
 * 多运行几次，会看到交叉出现ExtendThread的输出和主线程的输出
 * */
public class RunThreadExtendThread {
    public static void main(String[] args) {
        ExtendThread thread = new ExtendThread();
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main  " + i);
        }
    }
}
