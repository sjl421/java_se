package com.thinktik.demo08.extend;

class Animal1 {
    private String color;                    //毛的颜色
    private int leg;                        //腿的个数

    public Animal1() {
    }

    public Animal1(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }

    public String getColor() {                //获取颜色
        return color;
    }

    public void setColor(String color) {    //设置颜色
        this.color = color;
    }

    public int getLeg() {                    //获取腿的个数
        return leg;
    }

    public void setLeg(int leg) {            //设置腿的个数
        this.leg = leg;
    }

    public void eat() {                        //吃饭
        System.out.println("吃饭");
    }
}
