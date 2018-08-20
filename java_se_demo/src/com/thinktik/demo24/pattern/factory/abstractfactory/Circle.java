package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @author think
 * 2018年3月4日下午10:45:01
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
