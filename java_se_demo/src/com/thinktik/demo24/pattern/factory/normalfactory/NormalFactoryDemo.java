package com.thinktik.demo24.pattern.factory.normalfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 16:40
 */
public class NormalFactoryDemo {
    public static void main(String[] args) {
        Shape rectangle = new RectangleFactory().createShape();
        rectangle.draw();
        Shape circle = new CircleFactory().createShape();
        circle.draw();
        Shape square = new SquareFactory().createShape();
        square.draw();
    }
}
