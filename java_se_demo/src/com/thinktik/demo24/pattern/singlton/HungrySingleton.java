package com.thinktik.demo24.pattern.singlton;

/**
 * 饿汉式：类加载的时候就进行实例化，因为很急迫所以叫饿汉式
 * <p>
 * 饿汉式天然的线程安全，但是一上来不管是否会被使用就初始化自己有点浪费系统资源
 */
public class HungrySingleton {
    //私有化成员变量不让外界访问和修改，设为static让创建的实例常驻堆内存不自动消失
    //类加载的时候就进行实例化，这一步在所有的其他调用该对象getInstance()前面，所以不需要做null判断,
    // 并且就只创建一次，天然线程安全
    private static final HungrySingleton instance = new HungrySingleton();

    //构造方法私有化不让外界访问
    private HungrySingleton() {
        super();
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}


/*饿汉式

是否 Lazy 初始化：否
是否多线程安全：是
实现难度：易

描述：这种方式比较常用，但容易产生垃圾对象。
优点：没有加锁，执行效率会提高。
缺点：类加载时就初始化，浪费内存。
它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。*/