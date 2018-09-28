package com.thinktik.demo23.thread;

/**
 * @author think
 * 2018年3月4日下午7:40:56
 */

/**
 * 实现多线程的第二种方法:实现Runnable接口
 * <p>
 * 多运行几次，会看到交叉出现ExtendThread的输出和主线程的输出
 */
public class ImplRunnableRun {
    public static void main(String[] args) {
        ImplRunnable runnable1 = new ImplRunnable("A");
        ImplRunnable runnable2 = new ImplRunnable("B");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
