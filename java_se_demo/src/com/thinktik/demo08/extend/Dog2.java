package com.thinktik.demo08.extend;

class Dog2 extends Animal1 {
    public Dog2() {
    }                            //空参构造

    public Dog2(String color, int leg) {        //有参构造
        super(color, leg);
    }

    public void eat() {                        //吃肉
        System.out.println("狗吃肉");
    }

    public void lookHome() {                //看家
        System.out.println("看家");
    }
}
