package com.thinktik.extend;

/**
 * @author think
 * 2018年1月17日下午10:53:14
 * 
 */
class Demo6_Extends {
	public static void main(String[] args) {
		Son3 s1 = new Son3();
		System.out.println(s1.getName() + "..." + s1.getAge());
		System.out.println("--------------------");
		Son3 s2 = new Son3("张三", 23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}

/*
 * A:案例演示 父类没有无参构造方法,子类怎么办? super解决 this解决 
 * B:注意事项 super(…)或者this(….)必须出现在构造方法的第一条语句上
 */
class Father3 {
	private String name; // 姓名
	private int age; // 年龄

	public Father3() { // 空参构造
		System.out.println("Father 空参构造");
	}

	public Father3(String name, int age) { // 有参构造
		this.name = name;
		this.age = age;
		System.out.println("Father 有参构造");
	}

	public void setName(String name) { // 设置姓名
		this.name = name;
	}

	public String getName() { // 获取姓名
		return name;
	}

	public void setAge(int age) { // 设置年龄
		this.age = age;
	}

	public int getAge() { // 获取年龄
		return age;
	}
}

class Son3 extends Father3 {
	public Son3() { // 空参构造
		this("王五", 25); // 本类中的构造方法 必须出现在构造方法的第一条语句上
//		 super("李四",24); //调用父类中的构造方法

		System.out.println("Son 空参构造");
	}

	public Son3(String name, int age) { // 有参构造
		super(name, age);
		System.out.println("Son 有参构造");
	}
}