package com.thinktik.demo06.clazz;

/*
 * 模仿学生类，让学生自己完成
 * 属性:品牌(brand)价格(price)
 * 行为:打电话(call),发信息(sendMessage)玩游戏(playGame)
 */
public class Phone {
    String brand;                    //品牌
    int price;                        //价格
    
    public void call() {            //打电话
        System.out.println("打电话");
    }
    
    public void sendMessage() {        //发信息
        System.out.println("发信息");
    }
    
    public void playGame() {        //玩游戏
        System.out.println("玩游戏");
    }
}
