package com.thinktik.demo23.threadmethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 有返回值的线程
 */
public class ThreadDemo05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();
        
        int taskSize = 5;
        // 创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < taskSize; i++) {
            Callable<String> c = new MyCallable1(i + " ");
            // 执行任务并获取Future对象
            Future<String> f = pool.submit(c);
            // System.out.println(">>>" + f.get().toString());
            list.add(f);
        }
        // 关闭线程池
        pool.shutdown();
        
        // 获取所有并发任务的运行结果
        for (Future<String> f : list) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>" + f.get());
        }
        
        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间    :   " + (date2.getTime() - date1.getTime()) + "MS");
    }
    
    static class MyCallable1 implements Callable<String> {
        private String taskNum;
        
        MyCallable1(String taskNum) {
            this.taskNum = taskNum;
        }
        
        public String call() throws Exception {
            System.out.println(">>>" + taskNum + "任务启动");
            Date dateTmp1 = new Date();
            Thread.sleep(1000);
            Date dateTmp2 = new Date();
            long time = dateTmp2.getTime() - dateTmp1.getTime();
            System.out.println(">>>" + taskNum + "任务终止");
            return taskNum + "任务返回运行结果,当前任务时间  : " + time + "MS";
        }
    }
}
