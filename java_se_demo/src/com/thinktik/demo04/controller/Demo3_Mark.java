package com.thinktik.demo04.controller;

/**
 * @author think
 * 2018年1月16日下午11:43:43
 */
class Demo3Mark {                                        //mark 标记
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 10; i++) {        //a就是标号,只要是合法的标识符即可
            System.out.println("i = " + i);
            inner:
            for (int j = 1; j <= 10; j++) {
                System.out.println("j = " + j);
                break outer;  //跳出outer标记的循环
            }
        }

    }
}
