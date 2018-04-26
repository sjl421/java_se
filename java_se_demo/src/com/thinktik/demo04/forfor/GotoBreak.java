package com.thinktik.demo04.forfor;

import java.util.Random;

public class GotoBreak {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                int x = new Random().nextInt(10);
                if (x > 8) {
                    System.out.println(">> random x=" + x + " end outer loop ");
                    break outer;
                }
                if (x < 2) {
                    System.out.println(">> random x=" + x + " end inner loop ");
                    continue inner;
                }
                System.out.println("\ninner loop :" + j);
            }
            System.out.println("\nouter loop :" + i);
        }
        System.out.println("----> loop end!");
    }
}
