package com.thinktik;

/**
 * @author think
 * 2018年3月15日下午6:46:11
*/


/*为什么会出现这种结果呢？我们来分析一下，
 * 前两行代码执行之后，会向常量池中添加"hello"和 "world"这两个常量，
 * 由于jvm的编译时优化，当两个常量进行相加的时候，会将这个组成的新的常量添加到常量池中，并将引用返回，
 * 所以第三行代码就是向常量池中添加了"helloworld"，并将地址值赋给 s3，所以第一个为true，
 * 那么第二个为什么为false呢？因为第四行代码是两个变量相加，变量具有不确定性，
 * 所以jvm的编译优化不会起作用，所以第二个是false。*/
public class ConstantDemo2 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("java");
		System.out.println(s1 == s2); //false
		System.out.println(s2 == s3); //false
		
		String s4 = "hello";
		String s5 = "world";
		String s6 = "hello"+"world";
		String s7 = s4+s5;
		String s8 = "helloworld";
		System.out.println(s6 == s8);//true
		System.out.println(s7 == s8);//false
	}
}
