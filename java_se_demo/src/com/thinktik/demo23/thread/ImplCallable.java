package com.thinktik.demo23.thread;

import java.util.concurrent.Callable;

public class ImplCallable implements Callable<String> {

    private  String name;

    public ImplCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ImplCallable -->"+name + i);
        }
        return "MyCallable End!"+name;
    }

}
