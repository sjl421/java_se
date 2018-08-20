package com.thinktik.demo24.pattern.singlton;

/**
 * 内部类方式
 *
 * 可以算作是饿汉式的一种可延迟加载的改进
 */
public class InnerClassSinglton {
    private InnerClassSinglton() {
    }
    //静态内部类
    private static class SingletonHolder {
        private static final InnerClassSinglton INSTANCE = new InnerClassSinglton();
    }

    public static InnerClassSinglton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/*
是否 Lazy 初始化：是
是否多线程安全：是
实现难度：一般

描述：这种方式能达到双检锁方式一样的功效，但实现更简单，而且对静态域使用了延迟初始化，应使用这种方式而不是双检锁方式。
这种方式思维只适用于静态域的情况，双检锁方式思维是在实例域被需要延迟初始化时使用，它们都是延迟加载但是思路是不同的

这种方式跟饿汉式同样利用了classloder机制来保证初始化instance时只有一个线程，
它跟饿汉式不同的是：饿汉式式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），
而这种方式是Singleton类被装载了，instance不一定被初始化。因为SingletonHolder类没有被主动使用，
只有通过显式调用getInstance方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，
因为不能确保 Singleton 类还可能在其他的地方被主动使用从而已经被加载，那么这个时候实例化 instance 显然是不合适的。
这个时候，这种方式相比饿汉式就显得很合理。*/