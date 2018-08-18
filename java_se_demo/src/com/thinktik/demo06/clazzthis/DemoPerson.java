package com.thinktik.demo06.clazzthis;

/*
 * A:this关键字特点
 * 代表当前对象的引用
 * B:案例演示
 * this的应用场景
 * 用来区分成员变量和局部变量重名
 */
public class DemoPerson{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        System.out.println(p1.getName() + "..." + p1.getAge());

        Person p2 = new Person();
        p2.setName("李四");
        p2.setAge(24);
        System.out.println(p2.getName() + "..." + p2.getAge());
    }
}