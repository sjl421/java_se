package com.thinktik.demo07.statics;

public class Person {
    static String country;            //国籍
    String name;                    //姓名
    
    public void speak() {            //说话的方法
        System.out.println(name + "..." + country);
    }
}
