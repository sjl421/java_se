package com.thinktik.demo08.extend;

class DayOne extends 双桨 {
    public static void print() {                //静态只能覆盖静态,其实不算重写,多态时候详细讲解
        System.out.println("Zi print");
    }

    @Override
    public void 泡妞() {
        System.out.println("霸王硬上弓");
    }
}
