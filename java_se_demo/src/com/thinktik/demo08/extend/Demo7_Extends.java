package com.thinktik.demo08.extend;

/**
 * @author think
 * 2018年1月17日下午10:53:09
 * 
 */
class Demo7_Extends {
	public static void main(String[] args) {
		Son4 s = new Son4();
		s.print();
		s.method();
	}
}
/*
* a:不同名的方法
* b:同名的方法
*/

class Father4 {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son4 extends Father4 {
	public void method() {
		System.out.println("Zi Method");
	}
	@Override
	public void print() {
		super.print();							//super可以调用父类的成员方法
		System.out.println("Zi print");
	}
	
	public void print(String str) {
		super.print();							
		System.out.println(str);
	}
	
//	public String print(String str) {
//		super.print();							
//		System.out.println(str);
//	}
}