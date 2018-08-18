package com.thinktik.demo07.constructor;

/**
 * @author think
 * 2018年1月17日下午9:44:14
 */
public class DemoPerson3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("张三", 23);
        //p1 = new Person("张天一",23);	//这种方式看运行结果貌似是改名了,其实是将原对象变成垃圾
        System.out.println(p1.getName() + "..." + p1.getAge());

        System.out.println("--------------------");
        Person3 p2 = new Person3();        //空参构造创建对象
        p2.setName("李四");
        p2.setAge(24);

        p2.setName("李鬼");
        System.out.println(p2.getName() + "..." + p2.getAge());
    }
}

