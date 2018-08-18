package com.thinktik.demo08.extend;

/**
 * @author think
 * 2018年1月17日下午11:04:41
 */
public class Test5Animal {
    public static void main(String[] args) {
        Cat1 c1 = new Cat1("花", 4);
        System.out.println(c1.getColor() + "..." + c1.getLeg());
        c1.eat();
        c1.catchMouse();

        Dog2 d1 = new Dog2("黑", 2);
        System.out.println(d1.getColor() + "..." + d1.getLeg());
        d1.eat();
        d1.lookHome();
    }
}
/*
 * A:猫狗案例分析
 * B:案例演示
 * 猫狗案例继承版
 * 属性:毛的颜色,腿的个数
 * 行为:吃饭
 * 猫特有行为:抓老鼠catchMouse
 * 狗特有行为:看家lookHome
 */

