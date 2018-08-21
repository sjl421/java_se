package com.thinktik.demo28.anno.demo03;

public class Apple {
    private String name;
    @Color(Color.Type.GREEN)
    @Color(Color.Type.RED)
    private String color;

    public Apple() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }
}
