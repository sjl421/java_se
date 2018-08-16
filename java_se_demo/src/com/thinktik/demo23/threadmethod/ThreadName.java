package com.thinktik.demo23.threadmethod;

/**
 * 线程名字
 */
public class ThreadName {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //demo1();
        Thread t1 = new Thread() {
            @Override
            public void run() {
				this.setName("张三");
                System.out.println(this.getName() + "....aa");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                this.setName("李四");
                System.out.println(this.getName() + "....bb");
            }
        };

//        t1.setName("张三");
//        t2.setName("李四");
        t1.start();
        t2.start();
    }

    public static void demo1() {
        new Thread("芙蓉姐姐") {                            //通过构造方法给name赋值
            @Override
            public void run() {
                System.out.println(this.getName() + "....aa");
            }
        }.start();

        new Thread("凤姐") {
            @Override
            public void run() {
                System.out.println(this.getName() + "....bb");
            }
        }.start();
    }

}
