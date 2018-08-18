package com.thinktik.demo06.obj;

/**
 * @author think
 * 2018年1月17日下午9:16:52
 */

/*
车的属性
	车的颜色
	车的轮胎数
车的行为
	车运行
 */

public class Car {
    //成员变量  默认是public
    String color;                        //车的颜色
    int num;                            //车的轮胎数
    
    public void run() {                    //车运行
        System.out.println(color + "..." + num);
    }
}


