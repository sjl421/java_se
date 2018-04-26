package com.thinktik.demo23.threadmethod;

public class ThreadJoin {

    /**
     * @param args join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
     */
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + "...Thread1");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 2) {
                        try {
                            //t1.join();
                            t1.join(1);                    //插队指定的时间,过了指定时间后,两条线程交替执行
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + "...Thread2");
                }
            }
        };

        t1.start();
        t2.start();
    }

}
