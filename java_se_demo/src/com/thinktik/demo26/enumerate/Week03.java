package com.thinktik.demo26.enumerate;

public abstract class Week03 {

    public static final Week03 MON = new Week03("星期一") {
        public void show() {
            System.out.println("星期一");
        }
    };
    public static final Week03 TUE = new Week03("星期二") {
        public void show() {
            System.out.println("星期二");
        }
    };
    public static final Week03 WED = new Week03("星期三") {
        public void show() {
            System.out.println("星期三");
        }
    };

    private String name;

    //私有构造,不让其他类创建本类对象
    private Week03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
