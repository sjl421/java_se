package com.thinktik.demo03.ifelse;

/*
 * A:案例演示
 * if语句和三元运算符完成同一个效果
 * B:案例演示
 * if语句和三元运算符的区别

 * 三元运算符实现的，都可以采用if语句实现。反之不成立。

 * 什么时候if语句实现不能用三元改进呢?
 * 当if语句控制的操作是一个输出语句的时候就不能。
 * 为什么呢?因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。

 */

/**
 * @author think
 * 2018年1月13日下午10:53:46
 */
class Demo4_If {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println(x + "是最大值");
        } else {
            System.out.println(y + "是最大值");
        }

        int a = 20;
        int b = 30;
        // 三元运算符
        int c = (a > b) ? a : b;
    }
}
