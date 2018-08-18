package com.thinktik.demo08.finals;

public class Person {
    private String name;            //姓名
    private int age;                //年龄

    public Person() {
    }                //空参构造

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {        //获取姓名
        return name;
    }

    public void setName(String name) {    //设置姓名
        this.name = name;
    }

    public int getAge() {            //获取年龄
        return age;
    }

    public void setAge(int age) {    //设置年龄
        this.age = age;
    }
}
