package com.thinktik.demo01;//这是一个包的声明 包名是 com.thinktik.hello

/**
 * 一个java程序
 *
 * @author think
 */
public class HelloWorld2 { //这是一个类的声明,类名是Hello2	//单行注释是可以嵌套
    public static void main(String[] args) {//这是主方法,是程序的入口
        System.out.println("Hello world!");//这是输出语句,会在控制台输出一句话
		
		/* 多行注释不能嵌套
		故人西辞富士康
		为学技术去蓝翔
		蓝翔毕业包分配
		尼玛还是富士康
		*/
		
		/*
		包(其实就是文件夹,用于解决相同类名问题)
		举例
		包名要求全部小写,一般是公司的域名倒着写
		www.omob.cc  -> cc.omob
		
		类或者接口
		一个单词和和多个单词分别举例
		如果是一个单词,要求首字母大写,如果是多个单词要求每个单词首字母大写(驼峰命名)
		Base
		HelloWorld

		方法和变量
		一个单词和和多个单词分别举例
		如果是一个单词,每个字母都小写,如果是多个单词,从第二个单词开始首字母大写
		max(int x,int y)
		maxValue(int x,int y)

		常量
		一个单词和和多个单词分别举例
		如果是一个单词,所有字母大写,如果是多个单词也是所有字母大写,但是用_分开
		MAX
		MAX_VALUE
		*/
    }
}
