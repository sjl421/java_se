package com.thinktik.demo07.statics;

/**
 * @author think
 * 2018年1月17日下午9:49:34
 */
public class DemoStatic {
    public static void main(String[] args) {
        Person p1 = new Person();    //创建对象
        p1.name = "苍老师";            //调用姓名属性并赋值
        p1.country = "日本";        //调用国籍属性并赋值

        Person p2 = new Person();
        p2.name = "小泽老师";        //调用姓名属性并赋值
        //p2.country = "日本";		//调用国籍属性并赋值

        p1.speak();
        p2.speak();

        Person.country = "日本";    //静态多了一种调用方式,可以通过类名.
        System.out.println(Person.country);
    }
}