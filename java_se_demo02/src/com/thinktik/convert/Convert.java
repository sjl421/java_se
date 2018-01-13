package com.thinktik.convert;

/**
 * @author think 2018年1月13日下午8:00:00
 * 
 */
public class Convert { // scale 2,8,10,16进制
	public static void main(String[] args) {
		/*
		 * 0b100 0100 100 0x100
		 */
		System.out.println(0b100); // 4? 二进制表示形式前面加0b(b可以大写也可以小写)
		System.out.println(0100); // 64? 八进制表示形式前面加0
		System.out.println(100);
		System.out.println(0x100); // 256? 十六进制表示形式前面加0x(可以大写也可以小写)
	}
}
