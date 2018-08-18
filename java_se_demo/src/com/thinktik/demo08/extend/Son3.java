package com.thinktik.demo08.extend;

class Son3 extends Father3 {
    public Son3() { // 空参构造
        this("王五", 25); // 本类中的构造方法 必须出现在构造方法的第一条语句上
//		 super("李四",24); //调用父类中的构造方法

        System.out.println("Son 空参构造");
    }

    public Son3(String name, int age) { // 有参构造
        super(name, age);
        System.out.println("Son 有参构造");
    }
}
