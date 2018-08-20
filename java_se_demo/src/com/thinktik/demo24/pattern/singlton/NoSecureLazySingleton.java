package com.thinktik.demo24.pattern.singlton;

/**
 * 饿汉式
 * <p>
 * 单系统单线程安全版本，多线程分布式下不安全不可使用.
 * 很明显这个方法在多线程情况下一点都不安全，可能会创建多个实例.
 */
public class NoSecureLazySingleton {

    //私有化成员变量不让外界访问和修改，设为static让创建的实例常驻堆内存不自动消失
    private static NoSecureLazySingleton singleton;

    //构造方法私有化不让外界访问
    private NoSecureLazySingleton() {
        super();
    }

    public static NoSecureLazySingleton getInstance() {
        if (null == singleton) {
            singleton = new NoSecureLazySingleton();
        }
        return singleton;
    }
}
