package com.thinktik.demo10.innerclass.annoyclass;

/**
 * @author think
 * 2018年1月18日下午9:21:44
 * 
 */
class Demo3_Con {
	public static void main(String[] args) {
		Person1 p = new Person1();
//		p.Person();
	}
}

class Person1 {
	//public void Person() {						//不是构造方法,是一个普通方法
	public Person1() {
		System.out.println("Hello World!");
	}
}