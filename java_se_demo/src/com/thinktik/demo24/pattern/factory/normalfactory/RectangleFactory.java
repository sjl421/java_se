package com.thinktik.demo24.pattern.factory.normalfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 16:38
 */
public class RectangleFactory implements IShapeFactory {

    @Override public Shape createShape() {
        return new Rectangle();
    }
}
