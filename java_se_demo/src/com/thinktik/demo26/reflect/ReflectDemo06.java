package com.thinktik.demo26.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo06 {
	
	public String name;
	
	public static void main(String[] args) {
		Method[] methods = ReflectDemo06.class.getMethods();

		for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
		
		Integer modifiers = Fruit.class.getModifiers();
		System.out.println(modifiers.toHexString(modifiers));
		Boolean isAbstract=Modifier.isAbstract(modifiers);
		
		Field[] fields = ReflectDemo06.class.getFields();
		for (Field field : fields) {
			System.out.println("field = " + field.getName());
		}
		
		int[] arr = new int[] {2,3,4,5};
		Field[] arrfields = arr.getClass().getFields();
		for (Field field : arrfields) {
			System.out.println("field = " + field.getName());
		}
		
		
		
	}
}
