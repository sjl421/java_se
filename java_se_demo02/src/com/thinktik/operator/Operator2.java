package com.thinktik.operator;

/**
 * @author think
 * 2018年1月13日下午8:39:26
 *  ++ -- += -+ 的解析
 */
public class Operator2 {
	/*
	* a:单独使用：
	* 放在操作数的前面和后面效果一样。(这种用法是我们比较常见的)
	* b:参与运算使用：
	* 放在操作数的前面，先自增或者自减，然后再参与运算。
	* 放在操作数的后面，先参与运算，再自增或者自减。
	*/
	public static void main(String[] args) {
		//单独使用
/*		int a = 3;
		a++;						//a = a + 1;
		++a;						//a = a + 1;
		System.out.println(a);*/

		//参与运算使用
		int a = 3;
		int b;

		//b = a++;					//当++在变量后面的时候,会先将变量中的值取出做赋值操作,然后再自身加1
		b = ++a;					//当++在变量前面的时候,会先自身加1,然后在将结果赋值
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//第一题
		/*int a = 10;
		int b = 10;
		int c = 10;
	
		a = b++;					//a = 10 ,b = 11
		c = --a;					//a = 9, c = 9			
		b = ++a;					//a = 10, b = 10	
		a = c--;					//a = 9, c = 8			
		
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);*/

		//第二题
		/*int x = 4;
		//		4	+	6+	60
		int y = (x++)+(++x)+(x*10);

		System.out.println("x = " + x + ",y = " +  y);*/

		//第三题问哪句会报错,为什么 
	/*	byte b = 10;
		//b++;					//对的  b = (byte)(b + 1)
		b = b + 1;				//错的 当byte与int进行混合运算的时候,会提升为int类型,两个int相加的结果还是int,赋值给byte会损失精度
		System.out.println("b = " + b);*/
	}
}
