package com.thinktik.demo24.pattern.factory.abstractfactory;

/**
 * @Author: thinktik
 * @Date: 2018/8/20 16:58
 */
public class Red implements Color {

    @Override public void fill() {
        System.out.println("Red Color");
    }
}
