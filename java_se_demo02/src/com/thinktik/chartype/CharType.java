package com.thinktik.chartype;

/**
 * @author think
 * 2018年1月13日下午8:13:42
 * 
 */
public class CharType {
	public static void main(String[] args) {
		char c = 'a'; // 占2个字节 底层以ascii数字的形式保存 使用unicode编码所以2个字节
		System.out.println(c);

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
