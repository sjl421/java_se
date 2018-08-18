package com.thinktik.demo05.array;

/*
 * A:静态初始化的格式：
 * 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
 * 简化格式：
 * 数据类型[] 数组名 = {元素1,元素2,…};
 * B:案例演示
 * 对数组的解释
 * 输出数组名称和数组元素
 * C:画图演示
 * 一个数组
 */

/**
 * @author think
 * 2018年1月16日下午11:55:02
 */
public class Demo06Array {
    public static void main(String[] args) {
        //数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
        //int[] arr1 = new int[5]{11,22,33,44,55};	//error 不允许动静结合
        int[] arr1 = {11, 22, 33, 44, 55};                //静态初始化的简写形式

        int[] arr2;                                //声明数组引用
        arr2 = new int[]{11, 22, 33, 44, 55};

        int[] arr3;
        //arr3 = {11,22,33,44,55};				//error 简写形式声明和赋值在同一行

        int[] arr4 = {11, 22, 33, 44, 55};
        System.out.println(arr4);
        System.out.println(arr4[4]);
    }
}
