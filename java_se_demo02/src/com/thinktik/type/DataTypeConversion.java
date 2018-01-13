package com.thinktik.type;

/**
 * @author think
 * 2018年1月13日下午8:09:09
 * 
 */
public class DataTypeConversion {
	public static void main(String[] args) {
		//数据类型转换之隐式转换

		/*int x = 3;
		byte b = 4;

		x = x + b;

		System.out.println(x);*/

		//数据类型转换之强制转换
		/*int x = 3;
		byte b = 4;

		b = (byte)(x + b);
		System.out.println(b);*/

		//00000000 00000000 00000000 10000010			130的二进制
		//10000010										-126补码
		//00000001										-1求反码
		//10000001										-126反码
		//11111110										-126原码
		byte b = (byte)(126 + 4); //向上溢出
		System.out.println(b);
		//00000000 00000000 00000001 00101100			300的二进制
		//00101100
		byte b2 = (byte)300;
		System.out.println(b2);
		
		System.out.println('a' + 1);			//98,因为有ASCII码表,a字符对应的是int类型的97
		//System.out.println((char)('a' + 1));

		System.out.println("hello"+'a'+1);		//任何数据类型用+与字符串相连接都会产生新的字符串
		System.out.println('a'+1+"hello");		//98hello

		System.out.println(" 5 + 5 = " + (5 + 5));
	}
}
