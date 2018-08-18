package com.thinktik.demo07.constructor;

/**
 * @author think
 * 2018年1月17日下午9:36:33
 */
public class DemoPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();

        System.out.println("---------------------");

        Person p2 = new Person("张三", 23);
        p2.show();

        System.out.println("---------------------");

        Person p3 = new Person("李四", 24);
        p3.show();
    }
}
