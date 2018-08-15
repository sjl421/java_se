package com.thinktik.demo23.thread;

import java.util.concurrent.Callable;

public class ImplCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ImplCallable   " + i);
        }
        return "MyCallable End!";
    }

}
