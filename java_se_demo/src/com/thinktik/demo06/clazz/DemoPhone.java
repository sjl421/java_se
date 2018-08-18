package com.thinktik.demo06.clazz;

/**
 * @author think
 * 2018年1月17日下午9:23:29
 */
public class DemoPhone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //调用对象中的属性并赋值
        p.brand = "锤子";
        p.price = 998;

        System.out.println(p.brand + "..." + p.price);

        //调用成员方法
        p.call();
        p.sendMessage();
        p.playGame();
    }
}
