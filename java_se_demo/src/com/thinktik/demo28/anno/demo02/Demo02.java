package com.thinktik.demo28.anno.demo02;


import java.lang.reflect.Field;

public class Demo02 {
    public static void main(String[] args) {
        getFruitInfo(Apple.class);
    }

    public static void getFruitInfo(Class<?> clazz) {
        String name="";
        String color="";

        Field[] fields=clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName=field.getAnnotation(FruitName.class);
                name=fruitName.value();
                System.out.println(name);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor=field.getAnnotation(FruitColor.class);
                color=fruitColor.fruitColor().toString();
                System.out.println(color);
            }
        }
    }
}
