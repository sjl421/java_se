package com.thinktik.demo08.extend;

/*
 * A:继承(extends)
 * 让类与类之间产生关系,子父类关系
 * B:继承案例演示：
 * 动物类,猫类,狗类
 * 定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
 * C:案例演示
 * 使用继承前
 * D:案例演示
 * 使用继承后
 */
public class DemoExtends {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.color = "花";
        c.leg = 4;
        c.eat();
        c.sleep();

        System.out.println(c.leg + "..." + c.color);
    }
}

