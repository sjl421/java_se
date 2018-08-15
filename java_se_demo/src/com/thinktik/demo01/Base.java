package com.thinktik.demo01;

/**
 * @author think
 * 2018年1月13日下午7:38:58
 */
public class Base {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        /*
         * 标识符的命名规则注意事项? 只能用字母大小写 ,数字 ,$_ 两个符号 不能以数字开头 不能用关键字.
         */
        b = a++; // a = 11 b = 10
        a = b++; // a = 10 b = 11
        a = ++a; // a = 11
        b = ++b; // b = 12
        // System.out.print();和System.out.println();的区别是什么
        // print 不换行 println 结果换行
        System.out.println("a=" + a + " b=" + b);

        int x = 4;
        int y = (x++) + (++x) + (x * 6);  // 4   6 36  46
        System.out.println("x=" + x + ",y=" + y);
    }
}
