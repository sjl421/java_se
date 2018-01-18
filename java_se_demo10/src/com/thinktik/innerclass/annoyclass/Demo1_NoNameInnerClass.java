package com.thinktik.innerclass.annoyclass;

/**
 * @author think
 * 2018年1月18日下午9:16:57
 * 
 */
class Demo1_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
/*
//* A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
* 
		new 类名或者接口名(){
			重写方法;
		}
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
* E:案例演示
	* 按照要求来一个匿名内部类
*/

interface Inter1 {
	public void print();
}

class Outer {
	class Inner implements Inter1 {
		public void print() {
			System.out.println("print");
		}
	}

	public void method(){
		//Inner i = new Inner();
		//i.print();
		//new Inner().print();
//		Inter1 i = new Inner();			//父类引用指向子类对象
		
		new Inter1() {						//实现Inter接口
			public void print() {			//重写抽象方法
				System.out.println("print");
			}
		}.print();
	}
}