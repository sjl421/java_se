package com.thinktik.demo02.type;

/**
 * @author think 2018年1月13日下午8:03:24
 * 数据类型
 */
public class DataType {
	public static void main(String[] args) {
		// 整数类型 byte short int long    
		byte b = 10; // 占一个字节,-128 到 127
		short s = 20; // 占两个字节
		int i = 30; // 占四个字节     整数默认的数据类型就是int类型
		long l1 = 321;//占八个字节  整数默认的数据类型就是int类型  int向上转型long 
		//long l2 = 8888888888;  //超过了int的范围  error:The literal 8888888888 of type int is out of range 
		long l3 = 8888888888L; // 解决上一行的报错  占八个字节 如果long类型后面加L进行标识最好加大L,因为小l太像1了
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l3);
		System.out.println(Integer.BYTES);// java判断Integer的字节大小4个字节

		System.out.println(12345 + 54321L);//默认类型转换为long

		// 浮点类型
		float f = 12.3f;  // 占四个字节 浮点数默认是double所以要单精度浮点数要加上f或F
		double d1 = 33.4; // 占八个字节 小数默认的数据类型是double
		double d2 = 33.4d;//double类型后面也可以用D或d标识,但是一般不加
		System.out.println(f);
		System.out.println(d2);

		// 字符类型
		char c1 = 'a'; // 占两个字节 char在Java中是16位的，因为Java用的是Unicode
		char c2 = '中';
		System.out.println(c2);

		// 布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
