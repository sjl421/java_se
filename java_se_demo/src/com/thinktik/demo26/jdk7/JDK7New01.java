package com.thinktik.demo26.jdk7;

public class JDK7New01 {

    /**
     * A:二进制字面量
     * B:数字字面量可以出现下划线
     * C:switch 语句可以用字符串
     * D:泛型简化,菱形泛型
     * E:异常的多个catch合并,每个异常用或|
     * F:try-with-resources 语句,1.7版标准的异常处理代码
     * <p>
     * 100_000
     */
    public static void main(String[] args) {
        System.out.println(0b110);
        System.out.println(100_000);
    }

}
