package com.thinktik.demo26.reflect;

import com.thinktik.demo26.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectField {

    /**
     * Class.getField(String)方法可以获取类中的指定字段(可见的),
     * 如果是私有的可以用getDeclaredField("name")方法获取,通过set(obj, "李四")方法可以设置指定对象上该字段的值,
     * 如果是私有的需要先调用setAccessible(true)设置访问权限,用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.thinktik.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);    //获取有参构造
        Person p = (Person) c.newInstance("张三", 23);                        //通过有参构造创建对象
        //获取私有field
//		Field f1 = clazz.getField("name");								//获取姓名字段
//		f1.set(p, "李四");												//修改姓名的值
        Field f2 = clazz.getDeclaredField("name");                        //暴力反射获取字段
        f2.setAccessible(true);                                            //去除私有权限
        f2.set(p, "李四");

        System.out.println(p);
    }

}
