package com.thinktik.demo08.finals;

public class Son /*extends Father*/ {
    public static final double PI = 3.14;    //final修饰变量叫做常量,一般会与public static共用
    final int NUM = 10;                        //常量命名规范,如果是一个单词,所有字母大写,如果是多个单词,每个单词都大写,中间用下划线隔开

    public void print() {
        //NUM = 20;
        System.out.println(NUM);
    }
}
