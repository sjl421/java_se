package com.thinktik.demo23.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ThinkTik
 * @date 2018/9/28  10:53
 */
public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            executorService.execute(new ImplRunnable("A"+i));
        }
    }
}
