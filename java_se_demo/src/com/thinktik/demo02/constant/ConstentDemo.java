package com.thinktik.demo02.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author think
 * 2018年3月3日下午12:35:22
 * <p>
 * java 常量
 */
public class ConstentDemo { //constant 常量学习
    public static void main(String[] args) {

        //常量在程序执行的过程中其值不可以发生改变
        //
        //java内置的字面值常量
        //字符串常量	用双引号括起来的内容
        //整数常量		所有整数
        //小数常量		所有小数
        //字符常量		用单引号括起来的内容,里面只能放单个数字,单个字母或单个符号
        //布尔常量		较为特殊，只有true和false
        //空常量		     null(数组部分讲解)
        //
        //
        //自定义常量(面向对象部分讲)

        System.out.println("abc");        //字符串常量
        System.out.println(123);        //整数常量
        System.out.println(12.3);        //小数常量
        System.out.println('1');        //字符1  不是数字
        //System.out.println('10');		//error:   ''中必须放的是单个字符,10代表的是1字符和0字符
        //System.out.println('');		//error:   ''中什么也不放,也是不可以的,因为代表不了任何字符
        System.out.println(' ');        //带表空格字符
        System.out.println("");            //带表空字符串
        System.out.println(true);        //boolean类只有两个值,true和false
        System.out.println(false);


        //		final和const
        //
        //	    final这个关键字的含义是“这是无法改变的”或者“终态的”；
        //	    1.修饰变量
        //	    	final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
        //	    2.修饰方法
        //	    	final方法不能被子类方法覆盖，但可以被继承。
        //	    3.修饰类
        //	    	final类不能被继承，没有子类，final类中所有方法都是final的。
        //
        //
        //	    const是Java预留关键字，用于后期扩展用，用法跟final相似，不常用


        //定义一个常量 用final修饰
        //final float PI = 3.1415; //会报错  浮点数默认是double,所以会存在类型不匹配的问题
        //final float PI = (float) 3.1415;//强制转换  注意精度问题
        final float PI = 3.1415f;//解决上面的类型匹配问题
        //PI = 4.15f;// 重新赋值会发生错误 error:  The final local variable PI cannot be assigned.

        final List<String> CONST_LIST = new ArrayList<>();
        //CONST_LIST = new ArrayList<>();//error:final 修饰引用变量  当改变引用是会报错
        CONST_LIST.add("be changed");
        CONST_LIST.add("be changed again");  // 被final的引用对象不变的是引用的指向    但是引用对象里面的内容可以随便变化

        //再来看一个
        final int[] INT_ARR = new int[7];
        //INT_ARR = new int[] {};// error:指向被改变
        INT_ARR[0] = 1;//被改变,没有报错
        INT_ARR[1] = 2;//被改变没有报错


    }
}
