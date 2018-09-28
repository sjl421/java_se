package com.thinktik.demo23.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author think
 * 2018年3月4日下午8:07:09
 * <p>
 * 实现多线程的第三种方法:实现Callable接口
 */
public class ImplCallableRun {
    public static void main(String[] args) {
        ImplCallable callable1 = new ImplCallable("A");
        ImplCallable callable2 = new ImplCallable("B");
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        try {
            String result1 = futureTask1.get();
            String result2 = futureTask2.get();
            System.out.println("result1 :" + result1);
            System.out.println("result2 :" + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
