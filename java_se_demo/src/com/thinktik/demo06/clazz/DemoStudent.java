package com.thinktik.demo06.clazz;

/**
 * @author think
 * 2018年1月17日下午9:23:26
 */
public class DemoStudent {
    public static void main(String[] args) {
        //创建对象的格式:类名 对象名 = new 类名();
        //对象名:其实就是合法的标识符,如果是一个单词所有字母小写,如果是多个单词,从第二个单词开始首字母大写
        Student s = new Student();
        //* D:如何使用成员变量呢?
        //* 对象名.变量名
        s.name = "张三";
        s.age = 23;

        System.out.println(s.name + "..." + s.age);
        //* E:如何使用成员方法呢?
        //* 对象名.方法名(...)
        s.study();
        s.sleep();
    }
}


