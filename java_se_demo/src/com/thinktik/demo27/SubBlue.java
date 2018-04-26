package com.thinktik.demo27;

public class SubBlue extends Bule {


    public SubBlue() {
        super();
        super.a = 1;
        this.a = 2;
    }

    protected static void printA() {
        System.out.println("SubBlue :" + a);
    }
}
