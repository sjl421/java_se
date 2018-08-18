package com.thinktik.demo08.extend;

/**
 * @author think
 * 2018年1月17日下午10:53:14
 */
public class Demo6Extends {
    public static void main(String[] args) {
        Son3 s1 = new Son3();
        System.out.println(s1.getName() + "..." + s1.getAge());
        System.out.println("--------------------");
        Son3 s2 = new Son3("张三", 23);
        System.out.println(s2.getName() + "..." + s2.getAge());
    }
}

