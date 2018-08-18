package com.thinktik.demo07.constructor;

/**
 * @author think
 * 2018年1月17日下午9:33:51
 */
public class DemoConstructor {                        //Constructor构造
    public static void main(String[] args) {
        Person1 p = new Person1();                //在一创建对象的时候,系统就帮我调用了构造方法
        //p.Person();							//构造方法不能用对象调用
        p.show();

        Person1 p2 = new Person1();                //再次创建对象

        p2.show();
    }
}


