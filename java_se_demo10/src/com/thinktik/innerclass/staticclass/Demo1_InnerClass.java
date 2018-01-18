package com.thinktik.innerclass.staticclass;

class Demo1_InnerClass {
	public static void main(String[] args) {
		//外部类名.内部类名 对象名 = 外部类名.内部类对象;
		Outer1.Inner oi = new Outer1.Inner();
		oi.method();

		Outer1.Inner2.print();
	}
}

class Outer1 {
	static class Inner {
		public void method() {
			System.out.println("method");
		}
	}

	static class Inner2 {
		public static void print() {
			System.out.println("print");
		}
	}
}