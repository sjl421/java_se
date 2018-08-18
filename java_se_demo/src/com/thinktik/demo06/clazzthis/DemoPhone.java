package com.thinktik.demo06.clazzthis;

public class DemoPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("三星");
        p1.setPrice(5288);

        System.out.println(p1.getBrand() + "..." + p1.getPrice());
        p1.call();
        p1.sendMessage();
        p1.playGame();
    }
}

