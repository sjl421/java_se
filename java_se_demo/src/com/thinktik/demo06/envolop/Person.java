package com.thinktik.demo06.envolop;

public class Person {
    String name;                    //姓名   public
    private int age;                //年龄   private
    
    public int getAge() {            //获取年龄
        return age;
    }
    
    public void setAge(int a) {        //设置年龄
        if (a > 0 && a < 200) {
            age = a;
        } else {
            System.out.println("请回火星吧,地球不适合你");
        }
        
    }
    
    public void speak() {
        System.out.println(name + "..." + age);
    }
}
