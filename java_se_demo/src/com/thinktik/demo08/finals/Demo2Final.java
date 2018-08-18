package com.thinktik.demo08.finals;

/**
 * @author think
 * 2018年1月17日下午11:06:36
 */
public class Demo2Final {
    public static void main(String[] args) {
        final int num = 10;
        //num = 20;
        System.out.println(num);

        final Person p = new Person("张三", 23);
        //p = new Person("李四",24);
        p.setName("李四");
        p.setAge(24);

        System.out.println(p.getName() + "..." + p.getAge());

        method(10);
        method(20);
    }

    public static void method(final int x) {
        System.out.println(x);
    }
}
/*
 * A:案例演示
 * 方法内部或者方法声明上都演示一下(了解)

 * 基本类型，是值不能被改变
 * 引用类型，是地址值不能被改变,对象中的属性可以改变
 */

