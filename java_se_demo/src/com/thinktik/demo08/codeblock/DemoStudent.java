package com.thinktik.demo08.codeblock;


/**
 * @author think
 * 2018年1月17日下午10:43:45
 */
public class DemoStudent {
    static {
        System.out.println("Demo2_Student静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
    }
}

