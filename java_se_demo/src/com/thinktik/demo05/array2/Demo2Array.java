package com.thinktik.demo05.array2;

/*
 * A:画图演示
 * 画图讲解上面的二维数组名称，一维数组名称，一个元素的值的问题
 */

/**
 * @author think
 * 2018年1月16日下午11:59:42
 */
public class Demo2Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];

        System.out.println(arr);                    //打印二维数组
        System.out.println(arr[0]);                    //打印二维数组中的第一个一维数组
        System.out.println(arr[0][0]);                //打印二维数组中的第一个一维数组中的第一个元素
    }
}
