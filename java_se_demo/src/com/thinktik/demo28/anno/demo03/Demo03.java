package com.thinktik.demo28.anno.demo03;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        getFruitInfo(Apple.class);
    }

    public static void getFruitInfo(Class<?> clazz) {
        String name="";
        String color="";

        Field[] fields=clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Colors.class)) {
                Color[] fruitColor=field.getAnnotationsByType(Color.class);
                Arrays.stream(fruitColor)//
                    .forEach((item)->{
                        System.out.println(item.value().toString());
                    });
            }
        }
    }
}
