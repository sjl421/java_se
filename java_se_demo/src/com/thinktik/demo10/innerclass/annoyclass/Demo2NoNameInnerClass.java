package com.thinktik.demo10.innerclass.annoyclass;

interface Inter2 {
    public void show1();

    public void show2();
}

/**
 * @author think
 * 2018年1月18日下午9:16:52
 */
public class Demo2NoNameInnerClass {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.method();
    }
}

//匿名内部类只针对重写一个方法时候使用最好
class Outer2 {
    public void method() {
        new Inter2() {
            public void show1() {
                System.out.println("show1");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show1();

        new Inter2() {
            public void show1() {
                System.out.println("show1");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show2();

        Inter2 i = new Inter2() {
            public void show1() {
                System.out.println("show1");
            }

            public void show2() {
                System.out.println("show2");
            }

            public void show3() {
                System.out.println("show3");
            }
        };

        i.show1();
        i.show2();
//		i.show3();						//匿名内部类是不能向下转型的,因为没有子类类名
        //对比上一句
        new Inner2().show3();
    }

    class Inner2 implements Inter2 {

        @Override
        public void show1() {
        }

        @Override
        public void show2() {
        }

        public void show3() {
            System.out.println("show3");
        }
    }
}