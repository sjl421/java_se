package com.thinktik.demo07.constructor;

/*
构造方法
	给属性进行初始化
setXxx方法
	修改属性值
	这两种方式,在开发中用setXxx更多一些,因为比较灵活
*/
public class Person3 {
    private String name;                //姓名
    private int age;                    //年龄
    
    public Person3() {                    //空参构造
    }
    
    public Person3(String name, int age) {//有参构造
        this.name = name;
        this.age = age;
    }
    
    public String getName() {            //获取姓名
        return name;
    }
    
    public void setName(String name) {    //设置姓名
        this.name = name;
    }
    
    public int getAge() {                //获取年龄
        return age;
    }
    
    public void setAge(int age) {        //设置年龄
        this.age = age;
    }
}
