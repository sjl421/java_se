package com.thinktik.demo24.pattern.factory.normalfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 16:34
 */
public class SquareFactory implements IShapeFactory{
    @Override public Shape createShape() {
        return new Square();
    }
}
