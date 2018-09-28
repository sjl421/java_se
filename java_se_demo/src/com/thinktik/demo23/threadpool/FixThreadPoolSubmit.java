package com.thinktik.demo23.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ThinkTik
 * @date 2018/9/28 11:26
 */
public class FixThreadPoolSubmit {
    public static void main(String[] args) {
        int cpuNume = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPool =
            new ThreadPoolExecutor(2, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = threadPool.submit(new ImplCallable("A" + i));
            list.add(future);
        }

        for (Future<String> i : list) {
            try {
                System.out.println(i.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
