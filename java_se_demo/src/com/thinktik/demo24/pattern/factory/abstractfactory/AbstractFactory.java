package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 17:01
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
