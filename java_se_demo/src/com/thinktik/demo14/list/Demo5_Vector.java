package com.thinktik.demo14.list;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author think
 * 2018年1月18日下午11:25:50
 */
public class Demo5_Vector {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");

        Enumeration en = v.elements();                    //获取枚举
        while (en.hasMoreElements()) {                    //判断集合中是否有元素
            System.out.println(en.nextElement());        //获取集合中的元素
        }
    }

}
