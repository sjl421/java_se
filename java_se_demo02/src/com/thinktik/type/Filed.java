package com.thinktik.type;

/**
 * @author think 2018年1月13日下午8:06:01
 * 变量作用域
 */
public class Filed {
	public static void main(String[] args) {
		/*
		 * a:作用域问题 同一个区域不能使用相同的变量名 
		 * b:初始化值问题 局部变量在使用之前必须赋值 
		 * c:一条语句可以定义多个变量 int a,b,c...;
		 */
		
		 int x = 10; 
		 //int x = 20;//重新声明会报错
		 System.out.println(x);
		 int y;
		 //System.out.println(y);//error 先初始化在赋值
		 y = 10; 
		 System.out.println(y);
		 
		 //先申明后赋值
		int a, b, c, d, e;

		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		System.out.println(a+": "+b+": "+c+": "+d+": "+e);
	}
}
