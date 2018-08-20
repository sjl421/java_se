package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 17:07
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}

