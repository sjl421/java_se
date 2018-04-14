package com.thinktik.demo04.controller;

/**
 * @author think
 * 2018年1月16日下午11:43:26
 * 
 */
/*
 * A:break的使用场景
 * 只能在switch和循环中 
 */
class Demo1_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				break;							//跳出循环
			}

			System.out.println("x = " + x);
		}
	}
}
