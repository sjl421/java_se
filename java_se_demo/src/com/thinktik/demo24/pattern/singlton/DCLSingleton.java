package com.thinktik.demo24.pattern.singlton;

/**
 * 双检查方式实现的多线程安全单例模式，是对线程安全的懒汉式的一次改进
 * <p>
 * 相比线程安全的懒汉式，这个方式不是无差别的加锁，而是进行了两次if判断，所以叫双校验单例 doucle click singleton
 * 这个方式只有在实例未被创建的时候才会以同步代码块的形式创建，其余的情况直接返回已经被创建了的单例
 * <p>
 * 免除了频繁的加解锁和线程同步等待，大大的提升了效率
 */
public class DCLSingleton {
    private volatile static DCLSingleton singleton;
    private DCLSingleton() {
        super();
    }

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}


/*JDK 版本：JDK1.5 起

是否 Lazy 初始化：是
是否多线程安全：是
实现难度：较复杂

描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getInstance() 的性能对应用程序很关键。*/