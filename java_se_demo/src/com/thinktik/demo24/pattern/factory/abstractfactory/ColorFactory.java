package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 17:04
 */

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}

