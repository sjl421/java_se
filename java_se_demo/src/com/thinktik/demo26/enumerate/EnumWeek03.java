package com.thinktik.demo26.enumerate;

public enum EnumWeek03 {
    MON("星期一") {
        public void show() {
            System.out.println("星期一");
        }
    },
    TUE("星期二") {
        public void show() {
            System.out.println("星期二");
        }
    },
    WED("星期三") {
        public void show() {
            System.out.println("星期三");
        }
    };

    private String name;

    private EnumWeek03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();

}
