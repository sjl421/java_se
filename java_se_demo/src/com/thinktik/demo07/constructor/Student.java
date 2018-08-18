package com.thinktik.demo07.constructor;

/*
 * A:案例演示
 * 学生类：
 * 成员变量：
 * name，age
 * 构造方法：
 * 无参，带两个参
 * 成员方法：
 * getXxx()/setXxx()
 * show()：输出该类的所有成员变量值
 * B:给成员变量赋值：
 * a:setXxx()方法
 * b:构造方法
 
 * C:输出成员变量值的方式：
 * a:通过getXxx()分别获取然后拼接
 * b:通过调用show()方法搞定
 */

public class Student {
    private String name;                            //姓名
    private int age;                                //年龄
    
    public Student() {
    }                                //空参构造
    
    public Student(String name, int age) {            //有参构造
        this.name = name;
        this.age = age;
    }
    
    public String getName() {                        //获取姓名
        return name;
    }
    
    public void setName(String name) {                //设置姓名
        this.name = name;
    }
    
    public int getAge() {                            //获取年龄
        return age;
    }
    
    public void setAge(int age) {                    //设置年龄
        this.age = age;
    }
    
    public void show() {
        System.out.println("我的姓名是:" + name + ",我的年龄是:" + age);
    }
}
