package com.thinktik.demo23.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ThinkTik
 * @date 2018/9/28  11:02
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
        int cpuNum = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newScheduledThreadPool(cpuNum);

        for(int i=0;i<1000;i++){
            ((ScheduledExecutorService)executorService).schedule(new ImplRunnable("A"+i),20,TimeUnit.SECONDS);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println("Main Thread: Finished at:"+ new Date());
    }
}
