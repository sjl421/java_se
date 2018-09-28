package com.thinktik.demo23.threadpool;

import java.util.concurrent.Callable;

/**
 * @author ThinkTik
 * @date 2018/9/28 11:24
 */
public class ImplCallable implements Callable<String> {
    private String name;

    public ImplCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(10);
        return name;
    }
}
