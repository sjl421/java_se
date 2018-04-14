package com.thinktik.demo10.innerclass.annoyclass;

/**
 * @author think
 * 2018年1月18日下午9:21:51
 * 
 */
class Demo4_Override {
	public static void main(String[] args) {
		
	}
}

class Person2 {
	public void print() {
		System.out.println("Person");
	}
}

class Student extends Person2 {
	@Override
	public void print() {
		System.out.println("Student");
	}
}

class Father { 
	public Person2 method() {
		return new Person2();
	}
}

class Son extends Father {
	@Override
	public Student method() {
		return new Student();
	}
}

