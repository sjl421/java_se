package com.thinktik.demo03.TriOperator;

/**
 * @author think 2018年1月13日下午9:58:37
 * 三元运算符
 */
public class TriOperator01 {
	public static void main(String[] args) {
		//(关系表达式) ? 表达式1 : 表达式2;
		int x = 10;
		int y = 5;
		int z;
		z = (x > y) ? x : y;

		System.out.println("z = " + z);
	}
}
