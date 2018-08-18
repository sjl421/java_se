package com.thinktik.demo06.anoymousObj;

/**
 * @author think 2018年1月17日下午9:24:53
 */
public class Demo01Car {
    public static void main(String[] args) {
        // Car c1 = new Car();
        /*
         * c1.color = "red"; c1.num = 8; c1.run();
         */
        // method(c1);

        method(new Car());

        // Car c2 = new Car();
        // method(c2);
        method(new Car()); // 匿名对象可以当作参数传递
    }

    // 抽取方法提高代码的复用性
    public static void method(Car cc) { // Car cc = new Car();
        cc.color = "red";
        cc.num = 8;
        cc.run();
    }
}


