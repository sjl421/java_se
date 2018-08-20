package com.thinktik.demo24.pattern.singlton;

/**
 * @author think
 * 2018年3月4日下午11:21:49
 *
 * 懒汉式线程安全版本
 * 在尝试获取单实例对象的时候，方法上加上锁
 */
public class SecureLazySingleton {
    private static SecureLazySingleton singleton;

    private SecureLazySingleton() {
    }

    public static synchronized SecureLazySingleton getInstance() {
        if (singleton == null) {
            singleton = new SecureLazySingleton();
        }
        return singleton;
    }
}


/*懒汉式，线程安全

是否 Lazy 初始化：是
是否多线程安全：是
实现难度：易

描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
优点：第一次调用才初始化，避免内存浪费。
缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
好在getInstance() 的性能对应用程序不是很关键(该方法使用不太频繁),可以忍受*/