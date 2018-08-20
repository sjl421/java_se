package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @author think
 * 2018年3月4日下午10:45:04
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
