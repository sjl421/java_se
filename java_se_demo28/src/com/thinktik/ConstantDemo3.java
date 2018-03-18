package com.thinktik;

/**
 * @author think 2018年3月15日下午7:01:50
 */
public class ConstantDemo3 {
	public static void main(String[] args) {
		/*
		 * 第二个为true可以理解，因为intern的返回值本来就是该常量在常量池中的地址，但是为什么第一个也是true呢？其实在jdk1.7之前（
		 * 这里的运行环境是1.8），第一个是false的。那么是什么导致的呢？答案就是这个intern的实现方式。在jdk1.7之前的版本，调用这个方法的时候，
		 * 会去常量池中查看是否已经存在这个常量了，如果已经存在，那么直接返回这个常量在常量池中的地址值，如果不存在，则在常量池中创建一个，并返回其地址值。
		 * 但是在jdk1.7以及之后的版本中，常量池从perm区搬到了heap区。intern检测到这个常量在常量池中不存在的时候，不会直接在常量池中创建该对象了，
		 * 而是将堆中的这个对象的引用直接存到常量池中，减少内存开销。所以调用第二行代码的时候，就是将heap中的地址值存放到常量池中，
		 * 多以第三行代码获取的就是该字符串在heap中的地址值。
		 */
		String str1 = new String("hello") + new String("world");
		str1.intern();
		String str2 = "helloworld";
		System.out.println(str1 == str2); // true
		System.out.println(str1.intern() == str2); // true

		String str3 = new String("hello") + new String("java");
		String str4 = "hellojava";
		str3.intern();
		System.out.println(str3 == str4); // true
		System.out.println(str3.intern() == str4); // false

		/*
		 * 这个结果其实很好理解，在第一行代码执行的时候，会在heap中创建一个对象，并且回去常量池中查看该字符串是否已经存在，如果不存在，那么久创建一个。
		 * 所以第二行代码可以说是没什么作用的。
		 */
		String str5 = new String("java");
		str5.intern();
		String str6 = "java";
		System.out.println(str5 == str6);// false
		System.out.println(str5.intern() == str6);// true
	}
}
