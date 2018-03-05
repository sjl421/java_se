package com.thinktik.reflect;

import com.thinktik.bean.Person;

/**
 * @author think
 * 2018年3月5日下午8:28:08
 */

/** a:Object类的getClass()方法,判断两个对象是否是同一个字节码文件
* b:静态属性class,锁对象
* c:Class类中静态方法forName(),读取配置文件*/
public class ReflectDemo01 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = Class.forName("com.thinktik.bean.Person");
		Class clazz2 = Person.class;
		
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
	}

}
