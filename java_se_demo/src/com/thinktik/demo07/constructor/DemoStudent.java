package com.thinktik.demo07.constructor;

/**
 * @author think
 * 2018年1月17日下午9:44:33
 */
public class DemoStudent {
    public static void main(String[] args) {
        Student s1 = new Student();                    //使用空参构造
        s1.setName("张三");                            //设置姓名
        s1.setAge(23);                                //设置年龄

        System.out.println("我的姓名是:" + s1.getName() + ",我的年龄是:" + s1.getAge());
        //getXxx()获取属性值,可以打印,也可以赋值给其他的变量,做其他的操作
        Student s2 = new Student("李四", 24);
        s2.show();                                    //只是为了显示属性值
    }
}
