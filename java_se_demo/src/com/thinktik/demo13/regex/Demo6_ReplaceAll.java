package com.thinktik.demo13.regex;

/**
 * @author think
 * 2018年1月18日下午10:18:06
 */
public class Demo6_ReplaceAll {

    /**
     * * A:正则表达式的替换功能
     * String类的功能：public String replaceAll(String regex,String replacement)
     */
    public static void main(String[] args) {
        String s = "wo111ai222heima";
        String regex = "\\d";            //\\d代表的是任意数字

        String s2 = s.replaceAll(regex, "");
        System.out.println(s2);
    }

}
