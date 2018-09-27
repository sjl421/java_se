package com.thinktik.demo23.thread;

public class ExtendThread extends Thread {
    //1,继承Thread
    //2,重写run方法
    //3,将要执行的代码写在run方法中

    private String name;

    public ExtendThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ExtendThread  --> "+name + i);
        }
    }

}
