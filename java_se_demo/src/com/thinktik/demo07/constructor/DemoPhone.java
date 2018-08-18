package com.thinktik.demo07.constructor;

/**
 * @author think
 * 2018年1月17日下午9:45:10
 */
public class DemoPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("苹果");
        p1.setPrice(1500);
        System.out.println(p1.getBrand() + "..." + p1.getPrice());

        Phone p2 = new Phone("小米", 98);
        p2.show();
    }
}