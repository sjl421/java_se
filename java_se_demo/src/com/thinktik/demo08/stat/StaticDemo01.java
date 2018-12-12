package com.thinktik.demo08.stat;

public class StaticDemo01 {
	private static String greeting = "hello";
	private String str2 = "world";

	public static void main(String[] args) {
		print();			   //直接使用也可
		StaticDemo01.print();  // 直接类名调用
	}

	private static void print() {
//		str2 = "1"; // 报错
		greeting = "hola"; // 正常
	}
}
