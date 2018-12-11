package com.thinktik.demo23.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 * 实现Callable接口
 *
 * @author think
 */
public class ImplCallable {
    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable("A");
        MyCallable callable2 = new MyCallable("B");
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        // 会看到A B交替输出

        try {
            // 获取结果
            String result1 = futureTask1.get();
            String result2 = futureTask2.get();
            System.out.println("result1 :" + result1);
            System.out.println("result2 :" + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// 实现Callable接口
class MyCallable implements Callable<String> {
    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    // 重写call，call可以返回一个线程的运行结果。这是实现Callable的最大特点
    @Override
    public String call() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ImplCallable -->" + name + i);
        }
        return "MyCallable End!" + name;
    }
}
