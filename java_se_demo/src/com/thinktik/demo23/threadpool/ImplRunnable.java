package com.thinktik.demo23.threadpool;

/**
 * @author ThinkTik
 * @date 2018/9/28 10:41
 */
public class ImplRunnable implements Runnable {

    private String name;

    public ImplRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ImplRunnable -->" + name +"--"+ i);
        }
    }
}
