package com.thinktik.demo08.finals;

/*
 * A:final修饰变量的初始化时机
 * 显示初始化
 * 在对象构造完毕前即可
 */

public class Demo {
    //	final int num=20;	// 成员变量在类加载时被显示赋值初始化,那个构造方法再修改时会报错
    final int num;            //成员变量的默认初始化值是无效值,没有赋值时可以被构造方法修改一次
    
    public Demo() {
        num = 10;
    }
    
    public void print() {
        System.out.println(num);
    }
}