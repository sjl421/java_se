package com.thinktik.demo10.innerclass.staticclass;

/**
 * @author think
 * 2018年3月4日上午11:42:50
 * <p>
 * 静态内部类
 */
class Demo1_InnerClass {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = 外部类名.内部类对象;
        Outer1.Inner oi = new Outer1.Inner();
        Outer1.Inner3 oi3 = new Outer1().new Inner3();
        oi.method();

        Outer1.Inner2.print();
    }
}

class Outer1 {
    static class Inner {//静态内部类

        public void method() {
            System.out.println("method");
        }
    }

    static class Inner2 {
        public static void print() {
            System.out.println("print");
        }
    }

    class Inner3 {//成员内部类

        public /*static*/ void method() {
            System.out.println("method");
        }
    }
}