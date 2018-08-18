package com.thinktik.demo06.anoymousObj;

/*
 * A:方法的参数是类名public void print(Student s){}//print(new Student());
 * 如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
 */
public class Student {
    String name;                    //姓名
    int age;                        //年龄
    
    public void speak() {
        System.out.println(name + "..." + age);
    }
}
