package com.thinktik.demo07.constructor;

/*
 * A:构造方法概述和作用
 * 给对象的数据(属性)进行初始化
 * B:构造方法格式特点
 * a:方法名与类名相同(大小也要与类名一致)
 * b:没有返回值类型，连void都没有
 * c:没有具体的返回值return;
 */

public class Person1 {
    private String name;
    private int age;
    
    //构造方法
    public Person1() {
        System.out.println("Hello World!");
        name = "张三";
        age = 23;
        //return;								//构造方法也是有return语句的,格式是return;
    }
    
    public void show() {
        System.out.println(name + "..." + age);
    }
}