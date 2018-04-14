package com.thinktik.demo02.convert;

/**
 * @author think 2018年1月13日下午8:00:00
 * java 进制  
 * 2,8,10,16进制
 */
public class Convert { 
	public static void main(String[] args) {
		
		// 对于二进制可以使用8421法计算10进制的值   例如  1011 = 8+0+2+1 = 11
		//计算机本质上是以2进制计算的,涉及到原码 反码 补码
		/*
		 * 0b100 0100 100 0x100
		 */
		System.out.println(0b0100); // 4 二进制表示形式前面加0b(b可以大写也可以小写)
		System.out.println(0100);   // 64 八进制表示形式前面加0
		System.out.println(100);	// 十进制
		System.out.println(0x100);  // 256? 十六进制表示形式前面加0x(可以大写也可以小写)
	}
}
