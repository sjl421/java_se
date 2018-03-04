package com.thinktik.polymorphic;

public class Cat extends Animal{
	int leg = 4;
	
	public static void print() {
		System.out.println("cat static");
	}
	
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
