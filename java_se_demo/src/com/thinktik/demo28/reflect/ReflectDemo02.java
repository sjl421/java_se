package com.thinktik.demo28.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReflectDemo02 {

    /**
     * * 榨汁机(Juicer)榨汁的案例
     * 分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)
     *
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {
        Juicer j = new Juicer();                                    //创建榨汁机
        j.run(new Apple());
        j.run(new Orange());

        //用反射和配置文件
        BufferedReader br = new BufferedReader(new FileReader("src/com/thinktik/reflect/config.properties"));
        Class clazz = Class.forName(br.readLine());                    //获取该类的字节码文件
        Fruit f = (Fruit) clazz.newInstance();                        //创建实例对象
        j.run(f);
    }
}

