package com.thinktik.demo27;

/**
 * @author think 2018年3月15日下午6:38:25
 */

// 8种数据类型的包装类中，除了Double和Float，其它6种都会进入常量池，但是数值范围在-128到127之间
public class ConstantDemo1 {
	public static void main(String[] args) {
		// 验证Integer类型
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);// true
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);// false

		// 验证Long类型
		Long l1 = 127L;
		Long l2 = 127L;
		System.out.println(l1 == l2);// true
		Long l3 = 128L;
		Long l4 = 128L;
		System.out.println(l3 == l4);// false

		// 验证Byte类型
		Byte b1 = 127;
		Byte b2 = 127;
		System.out.println(b1 == b2);// true

		// 验证short类型
		Short s1 = 127;
		Short s2 = 127;
		System.out.println(s1 == s2);// true
		Short s3 = 128;
		Short s4 = 128;
		System.out.println(s3 == s4);// false

		// 验证Character类型
		Character c1 = 'a';
		Character c2 = 'a';
		System.out.println(c1 == c2);// true
		Character c3 = '你';
		Character c4 = '你';
		System.out.println(c3 == c4);// false

		// 验证boolean类型
		Boolean bo1 = true;
		Boolean bo2 = true;
		System.out.println(bo1 == bo2);// true

		// 验证double类型
		Double d1 = 1.2;
		Double d2 = 1.2;
		System.out.println(d1 == d2);// false

		// 验证float类型
		Float f1 = 1.2f;
		Float f2 = 1.2f;
		System.out.println(f1 == f2);// false
	}
}
