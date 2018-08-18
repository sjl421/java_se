package com.thinktik.demo08.codeblock;

public class Student1 {
    static {
        System.out.println("Student 静态代码块");
    }
    
    {
        System.out.println("Student 构造代码块");
    }
    
    public Student1() {
        System.out.println("Student 构造方法");
    }
}
