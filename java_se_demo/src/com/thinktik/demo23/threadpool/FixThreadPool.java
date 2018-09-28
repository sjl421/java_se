package com.thinktik.demo23.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ThinkTik
 * @date 2018/9/28 9:41
 */
public class FixThreadPool {

    public static void main(String[] args) {
        int cpuNume = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(cpuNume);

        for (int i = 0; i < 1000; i++) {
            executorService.execute(new ImplRunnable("A"+i));
        }
    }

}
