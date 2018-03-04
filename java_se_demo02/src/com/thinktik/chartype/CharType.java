package com.thinktik.chartype;

/**
 * @author think
 * 2018年1月13日下午8:13:42
 * 
 */
public class CharType {
	public static void main(String[] args) {
		char c = 'a'; // 占2个字节  char类型是一个单一的 16 位 Unicode 字符;除了可以存放传统的ASCII字符外还可以存放中文等单一字符1
		System.out.println(c);
		char hans='中';//其实很多人认为char就是存英文字母的,其实是不对的,char本质上存的是单一字符
		System.out.println(hans);

		byte b = 100;		// 一个字节  -127 --- 128
		char c1 = 97;		//0 - 65535
		System.out.println(c1);

		char c2 = 3;
		char c3 = 4;
		char c4 = 5;
		char c5 = 6;

		System.out.println(c2); //输出  不是3 而是ascii编码为3的字符
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		//char类型是否可以存储中文
		char c6 = '中'; //可以 因为java以unicode编码
		System.out.println(c6);
	}
}
