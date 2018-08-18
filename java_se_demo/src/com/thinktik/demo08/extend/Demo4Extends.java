package com.thinktik.demo08.extend;

/**
 * @author think
 * 2018年1月17日下午10:48:12
 */
public class Demo4Extends {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.print();
    }
}
/*
* A:案例演示
	* a:不同名的变量
	* b:同名的变量
		子父类出现同名的变量只是在讲课中举例子有,在开发中是不会出现这种情况的
		子类继承父类就是为了使用父类的成员,那么如果定义了同名的成员变量没有意义了
*/

