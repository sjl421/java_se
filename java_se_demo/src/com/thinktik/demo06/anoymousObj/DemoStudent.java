package com.thinktik.demo06.anoymousObj;

/**
 * @author think
 * 2018年1月17日下午9:24:03
 */
public class DemoStudent {
    public static void main(String[] args) {
        print(10);
        Student s = new Student();                    //创建对象,并将对象的地址值赋值给s
        print(s);
    }
    
    public static void print(int x) {                //基本数据类型当作形式参数
        System.out.println(x);
    }
    
    public static void print(Student stu) {            //引用数据类型当作形式参数
        stu.name = "张三";
        stu.age = 23;
        stu.speak();
    }
}

