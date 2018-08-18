package com.thinktik.demo08.extend;

/*
 * A:案例演示 父类没有无参构造方法,子类怎么办? super解决 this解决
 * B:注意事项 super(…)或者this(….)必须出现在构造方法的第一条语句上
 */
class Father3 {
    private String name; // 姓名
    private int age; // 年龄

    public Father3() { // 空参构造
        System.out.println("Father 空参构造");
    }

    public Father3(String name, int age) { // 有参构造
        this.name = name;
        this.age = age;
        System.out.println("Father 有参构造");
    }

    public String getName() { // 获取姓名
        return name;
    }

    public void setName(String name) { // 设置姓名
        this.name = name;
    }

    public int getAge() { // 获取年龄
        return age;
    }

    public void setAge(int age) { // 设置年龄
        this.age = age;
    }
}
