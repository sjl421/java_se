package com.thinktik.demo24.pattern.factory.normalfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 16:36
 */
public class CircleFactory implements IShapeFactory{
    @Override public Shape createShape() {
        return new Circle();
    }
}
