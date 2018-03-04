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
		int a1 = 3;
		a1++;						//a = a + 1;
		++a1;						//a = a + 1;
		System.out.println(a1);

		//参与运算使用
		int a2 = 3;
		int b2;

		//b = a++;					//当++在变量后面的时候,会先将变量中的值取出做赋值操作,然后再自身加1
		b2 = ++a2;					//当++在变量前面的时候,会先自身加1,然后在将结果赋值
		System.out.println("a = " + a2);
		System.out.println("b = " + b2);
		
		//第一题
		int a3 = 10;
		int b3 = 10;
		int c3 = 10;
		a3 = b3++;					//a = 10 ,b = 11
		c3 = --a3;					//a = 9, c = 9			
		b3 = ++a3;					//a = 10, b = 10	
		a3 = c3--;					//a = 9, c = 8			
		System.out.println("a = " + a3 + ",b = " + b3 + ",c = " + c3);

		//第二题
		int x1 = 4;
		//		4	+	6+	60
		int y1 = (x1++)+(++x1)+(x1*10);
		System.out.println("x = " + x1 + ",y = " +  y1);

		//第三题问哪句会报错,为什么 
		byte b4 = 10;
		b4++;					//对的  b = (byte)(b + 1)
		//b4 = b4 + 1;				//错的 当byte与int进行混合运算的时候,会提升为int类型,两个int相加的结果还是int,赋值给byte会损失精度
		System.out.println("b = " + b4);
	}
}
