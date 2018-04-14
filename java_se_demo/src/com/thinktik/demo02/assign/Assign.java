package com.thinktik.demo02.assign;

/**
 * @author think 2018年1月13日下午9:09:41
 * 赋值
 */
public class Assign {
	public static void main(String[] args) {
		// 赋值运算符  = += -= /+ *=
		int a = 3; // 把右边的常量值赋值给左边的变量,左边必须是变量
		// a += 4; //等同 a = a + 4;
		a = a + 4; //等同于上一行
		System.out.println(a);

		// 面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由。
		short s=1;
	   //s = s+1;         //error: 整数默认为int,当short与int进行运算的时候,会提升为int类型,两个int类型相加的结果也是int类型
		s = (short) (s+1);//解決上一行的问题  但是要注意强制转换的精度问题 
		s = 1;
		s += 1; // 相当于 s = (short)(s + 1);
		System.out.println(s);
		
		//byte b = 128;//error  默认为整数  超出了byte  -128~127的范围  会报错Type mismatch: cannot convert from int to byte 但是其实是超过了byte范围的问题
		byte b = 127; //对比上面的代码,这个正常. 同样的道理 byte short int long 都可能会出现这样的问题.
	}
}
