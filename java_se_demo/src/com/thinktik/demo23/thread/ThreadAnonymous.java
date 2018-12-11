package com.thinktik.demo23.thread;


/**
 * 对于前两种方法：继承Thread、实现Runnable的总结  匿名对象实现
 *
 *
 * @author think
 */
public class ThreadAnonymous {
    public static void main(String[] args) {

        // 匿名类实例，传入一个runnable匿名类实例重写run方法,构造出Thread实例，接着立即启动
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Runnable01   " + i);
                }
            }
        }.start();

        // 匿名类实例，传入一个Thread匿名类实例重写run方法,构造出Thread实例，接着立即启动
        new Thread(
                new Thread() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10000; i++) {
                            System.out.println("Thread02   " + i);
                        }
                    }
                }).start();


        // 匿名类实例，lambda方式传入一个runnable匿名类实例重写run方法，构造出Thread实例，接着立即启动
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Lambda03   " + i);
            }
        }).start();
    }
}
