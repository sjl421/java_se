package com.thinktik.demo08.extend;

class Cat1 extends Animal1 {
    public Cat1() {
    }                            //空参构造

    public Cat1(String color, int leg) {        //有参构造
        super(color, leg);
    }

    public void eat() {                        //吃鱼
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {                //抓老鼠
        System.out.println("抓老鼠");
    }
}
