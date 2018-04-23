package com.thinktik.demo28.asserts;

public class AssertDemo01 {
    public static void main(String[] args) {
        String name = null;
        //String name = null;
        assert (name != null) : "变量name为空null";
        System.out.println(name);
    }
}
