package com.thinktik.demo08.extend;

public class Test4Person {
     static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setName("张三");
        s1.setAge(23);
        System.out.println(s1.getName() + "..." + s1.getAge());
        s1.eat();
        s1.study();

        System.out.println("------------------");
        Student2 s2 = new Student2("李四", 24);
        System.out.println(s2.getName() + "..." + s2.getAge());
        s2.eat();
        s2.study();
    }
}
/*
 * 使用继承后的学生和老师案例
 */

class Person {
    private String name;                    //姓名
    private int age;                        //年龄

    public Person() {
    }                        //空参构造

    public Person(String name, int age) {    //有参构造
        this.name = name;
        this.age = age;
    }

    public String getName() {                //获取姓名
        return name;
    }

    public void setName(String name) {        //设置姓名
        this.name = name;
    }

    public int getAge() {                    //获取年龄
        return age;
    }

    public void setAge(int age) {            //设置年龄
        this.age = age;
    }

    public void eat() {                        //吃饭
        System.out.println(name + "吃饭");
    }
}

class Student2 extends Person {
    public Student2() {
    }                        //空参构造

    public Student2(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(this.getName() + "学习");
    }
}

class Teacher1 extends Person {
    public Teacher1() {
    }                        //空参构造

    public Teacher1(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(this.getName() + "讲课");
    }
}