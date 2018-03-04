package com.thinktik.bean;

/**
 * @author think
 * 2018年1月18日下午11:27:01
 * 
 */
public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/*@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}*/
	
}