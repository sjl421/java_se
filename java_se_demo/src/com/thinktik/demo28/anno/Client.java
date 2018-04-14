package com.thinktik.demo28.anno;

import java.lang.reflect.Method;

public class Client {
	public static void main(String[] args) {
		UseAnnoDemo01 annoDemo01 = new UseAnnoDemo01();
		
		if(UseAnnoDemo01.class.isAnnotationPresent(AnnotationDef.class)) {
			AnnotationDef annotationDef = UseAnnoDemo01.class.getAnnotation(AnnotationDef.class);
			
			System.out.println(annotationDef.classExplanation());
			System.out.println(annotationDef.classMessage());
		}else {
			System.out.println("没有类注解");
		}
		
		
		Method[] declaredMethods = UseAnnoDemo01.class.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			boolean hasAnnotation = method.isAnnotationPresent(AnnoattionDef02.class);
			if(hasAnnotation) {
				AnnoattionDef02 annoattionDef02 = method.getDeclaredAnnotation(AnnoattionDef02.class);
				System.out.println(annoattionDef02.explanation()+"--"+annoattionDef02.message());
			}
		}
	}
}
