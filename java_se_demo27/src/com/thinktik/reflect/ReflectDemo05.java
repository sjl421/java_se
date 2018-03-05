package com.thinktik.reflect;

import com.thinktik.bean.Student;

public class ReflectDemo05 {

	/**
	 * * A:案例演示
	* public void setProperty(Object obj, String propertyName, Object value){}，
	* 此方法可将obj对象中名为propertyName的属性的值设置为value。
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Student s = new Student("张三", 23);
		System.out.println(s);
		
		ReflectTool t = new ReflectTool();
		t.setProperty(s, "name", "李四");
		System.out.println(s);
	}

}

