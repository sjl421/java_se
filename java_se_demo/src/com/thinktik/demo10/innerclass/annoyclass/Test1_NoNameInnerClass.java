package com.thinktik.demo10.innerclass.annoyclass;

class Test1_NoNameInnerClass {
    public static void main(String[] args) {
        //如何调用PersonDemo中的method方法呢?
        PersonDemo pd = new PersonDemo();
        pd.method("Hello");
        pd.method(new Person3() {
            public void show() {
                System.out.println("show");
            }
        });
    }
}

//这里写抽象类，接口都行
abstract class Person3 {
    public abstract void show();
}

class PersonDemo {

    public void method(Person3 p) {        //Person p = new Student();		//父类引用指向子类对象
        p.show();
    }

    public void method(String s) {
        Person3 p = new Person3() {    //匿名内部类
            public void show() {
                System.out.println(s);
            }
        };

        p.show();
    }
}

class Student2 extends Person3 {
    public void show() {
        System.out.println("show");
    }
}