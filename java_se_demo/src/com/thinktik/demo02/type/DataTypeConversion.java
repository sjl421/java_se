package com.thinktik.demo02.type;

/**
 * @author think
 * 2018年1月13日下午8:09:09
 * 数据类型的转换 
 * 
 */
public class DataTypeConversion {
	public static void main(String[] args) {
		//数据类型转换之隐式转换
		int x1 = 3;
		byte b1 = 4;
		x1 = x1 + b1; //发生隐式转换   byte先转int
		System.out.println(x1);

		//数据类型转换之强制转换
		int x2 = 3;
		byte b2 = 4;
		b2 = (byte)(x2 + b2); //发生显示转换 强制转换 可能丢失精度
		System.out.println(b2);

		
		//演示类型转换 计算错误的问题
		//00000000 00000000 00000000 10000010			130的二进制
		//10000010										-126补码
		//10000001										-1求反码
		//10000001										-126反码
		//11111110										-126原码
		byte b3 = (byte)(126 + 4); //向上溢出
		System.out.println(b3);
		//00000000 00000000 00000001 00101100			300的二进制
		//00101100
		byte b4 = (byte)300;
		System.out.println(b4);
		
		System.out.println('a' + 1);			//98,因为有ASCII码表,a字符对应的是int类型的97
		//System.out.println((char)('a' + 1));

		System.out.println("hello"+'a'+1);		//任何数据类型用+与字符串相连接都会产生新的字符串
		System.out.println('a'+1+"hello");		//98hello 因为有ASCII码表,a字符对应的是int类型的97

		System.out.println(" 5 + 5 = " + (5 + 5));
	}
}
