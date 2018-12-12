package com.thinktik.demo08.equals;

public class EqualsDemo {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2);  // false
		System.out.println(str1.equals(str2)); // true
		
		String str = new String("hello");
		str1 = str;
		str2 = str;
		System.out.println(str1==str2);//true
		int i = 3;
		int j = 3;
		System.out.println(i==j); //true		
	}
}
