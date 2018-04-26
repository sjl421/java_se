package com.thinktik.demo10.innerclass.annoyclass;

//按照要求，补齐代码
interface Inter3 {
    void show();
}

/**
 * @author think
 * 2018年1月18日下午9:27:03
 */
class Test2_NoNameInnerClass {
    public static void main(String[] args) {
        Outer3.method().show();            //链式编程,每次调用方法后还能继续调用方法,证明调用方法返回的是对象
        Inter3 i = Outer3.method();
        i.show();
    }
}

class Outer3 {
    //补齐代码
    public static Inter3 method() {
        return new Inter3() {
            public void show() {
                System.out.println("show");
            }
        };
    }
}

