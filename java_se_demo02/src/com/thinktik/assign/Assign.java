package com.thinktik.assign;

/**
 * @author think 2018年1月13日下午9:09:41
 * 
 */
public class Assign {
	public static void main(String[] args) {
		// 赋值运算符
		int a = 3; // 把右边的常量值赋值给左边的变量,左边必须是变量

		// a += 4; //a = a + 4;
		a = a + 4;
		System.out.println(a);

		// 面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由。
		// short s=1;s = s+1; //当short与int进行运算的时候,会提升为int类型,两个int类型相加的结果也是int类型
		short s = 1;
		s += 1; // s = (short)(s + 1);

		System.out.println(s);
	}
}
