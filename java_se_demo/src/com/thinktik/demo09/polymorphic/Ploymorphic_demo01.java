package com.thinktik.demo09.polymorphic;

/**
 * @author think
 * 2018年3月4日下午1:19:19
 */


/*多态polymorphic概述:事物存在多种形态
多态的前提:1,要有继承;2,要有方法重写;3,要有父类对象指向子类对象*/

//成员变量:编译看左边(父类),运行看左边(父类)
//成员方法:编译看左边(父类),运行看右边(子类)  动态绑定
//静态方法:编译看左边(父类),运行看左边(父类)
//静态和编译相关,算不上重写,所以访问的是左边
//
//只有非静态成员方法;编译看左边(父类),运行看右边(子类);
public class Ploymorphic_demo01 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.print();
		System.out.println(c.leg);
		Animal a = new Cat();
		a.eat();
		a.print();
		System.out.println(a.leg);
		
	}
}
