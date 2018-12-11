package com.thinktik.demo02.convert.box;

/**
 * 装箱拆箱的面试题
 */
public class PackingTest {

    public static void main(String[] args) {
        Integer f1 = 100;
        Integer f2 = 100;
        Integer f3 = 150;
        Integer f4 = 150;
        System.out.println(f1 == f2);//true
        System.out.println(f3 == f4);//false

        Integer i = Integer.valueOf(10);
    }
}
