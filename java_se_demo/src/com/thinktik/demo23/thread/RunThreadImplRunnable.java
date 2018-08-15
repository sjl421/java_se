package com.thinktik.demo23.thread;

/**
 * @author think
 * 2018年3月4日下午7:40:56
 */


/*
 * 实现多线程的第二种方法:实现Runnable接口
 *
 * 多运行几次，会看到交叉出现ExtendThread的输出和主线程的输出
 * */
public class RunThreadImplRunnable {
    public static void main(String[] args) {
        ImplRunnable runnable = new ImplRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main  " + i);
        }
    }
}
