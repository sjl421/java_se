package com.thinktik.demo23.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ThinkTik
 * @date 2018/9/28 11:26
 */
public class FixThreadPoolSubmit {
    public static void main(String[] args) {
        int cpuNume = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(cpuNume);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Future<String> future = executorService.submit(new ImplCallable("A" + i));
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
