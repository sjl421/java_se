package com.thinktik.demo28.reflect.synthetic;


import java.lang.reflect.Method;
import java.util.Calendar;

public class DemoSynthetic {
    public static void main(String[] args) {
        InnerClass ic = new InnerClass();

        System.out.println(ic.name);

        Class clazz = ic.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName() +":" +m.isSynthetic());
        }
    }

    private static final class InnerClass {
        private String name = "InnerClass";
        private int value = 1;
        private Calendar calendar = Calendar.getInstance();
        private boolean isTrue = true;
    }
}
