package com.thinktik.errors;

/**
 * @author think 2018年1月13日下午8:26:05
 * 
 */
public class DataType {
	public static void main(String[] args) {
		// 面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由。
		byte b1 = 3;
		byte b2 = 4;
		// byte b3 = b1 + b2;
		/*
		 * 从两方面 1,byte与byte(或short,char)进行运算的时候会提升为int,两个int类型相加的结果也是int类型
		 * 2,b1和b2是两个变量,变量存储的值是变化,在编译的时候无法判断里面具体的值,相加有可能会超出byte的取值范围
		 */
		// System.out.println(b3);
		// byte b4 = 3 + 4; //java编译器有常量优化机制
		byte b4 = 7;
		System.out.println(b4);

		float f = 12.3f; //不加f会报错,默认是double
		long x = 12345;

		// f = x; //隐式转换
		// System.out.println(f);

		x = (long) f; // 强制转换
		System.out.println(x);

		/*
		 * float占4个字节 IEEE 754 32个二进制位 1位代表是符号位 8位代表指数位 00000000 - 11111111 0 - 255 0代表0
		 * 255代表无穷大 1 - 254
		 * 
		 * -126 - 127 23位代表尾数位
		 */
	}
}
