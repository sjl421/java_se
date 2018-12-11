package com.thinktik.demo23.ThreadSafe;

/**
 * 一个线程类的多个实例间不共享成员变量
 *这时不存在多线程变量共享的问题，是安全的
 *
 * @author think
 */
public class ThreadNoShare {
    public static void main(String[] args) {
        NoShareVar sv1 = new NoShareVar("A");
        NoShareVar sv2 = new NoShareVar("B");
        NoShareVar sv3 = new NoShareVar("C");

        sv1.start();
        sv2.start();
        sv3.start();
    }
}

class NoShareVar extends Thread{
    private int count=5;

    public NoShareVar(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (count>0){
            count--;
            System.out.println("线程 "+Thread.currentThread().getName()+"  count :"+count);
        }
    }
}
