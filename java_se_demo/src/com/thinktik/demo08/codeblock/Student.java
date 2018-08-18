package com.thinktik.demo08.codeblock;

public class Student {
    static {                                    //随着类加载而加载,且只执行一次
        System.out.println("我是静态代码块");        //作用:用来给类进行初始化,一般用来加载驱动
    }                                            //静态代码块是优先于主方法执行
    
    private String name;
    private int age;
    
    {                                            //构造代码块:每创建一次对象就会执行一次,优先于构造函数执行
        System.out.println("构造代码块");
        study();
    }
    
    public Student() {
        //study();
        System.out.println("空参构造");
    }                    //空参构造
    
    public Student(String name, int age) {//有参构造
        //study();
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void study() {
        System.out.println("学生学习");
    }
    
}
