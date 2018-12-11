package com.thinktik.demo23.ThreadSafe;

/**
 * 一个线程类的多个实例间共享成员变量
 *这时存在多线程变量共享的问题，不是安全的
 *
 * @author think
 */
public class ThreadShare {
    public static void main(String[] args) {
        ShareVar sv1 = new ShareVar("A");

        Thread thread1 = new Thread(sv1);
        Thread thread2 = new Thread(sv1);
        Thread thread3 = new Thread(sv1);
        Thread thread4 = new Thread(sv1);
        Thread thread5 = new Thread(sv1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

class ShareVar extends Thread{
    private int count=5;

    public ShareVar(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run() {
       synchronized (this){
           while (count>0){
               count--;
               System.out.println("线程 "+Thread.currentThread().getName()+"  count :"+count);
           }
       }
    }
}
