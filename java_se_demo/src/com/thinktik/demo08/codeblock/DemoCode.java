package com.thinktik.demo08.codeblock;

/**
 * @author think
 * 2018年1月17日下午10:40:06
 */
public class DemoCode {
    static {
        System.out.println("我是在主方法类中的静态代码块");
    }

    public static void main(String[] args) {
        {
            int x = 10;                        //局部代码块 限定变量的声明周期
            System.out.println("我是在主方法类中的局部代码块");
        }

        Student s1 = new Student();
        System.out.println("---------------");
        Student s2 = new Student("张三", 23);

    }

}

