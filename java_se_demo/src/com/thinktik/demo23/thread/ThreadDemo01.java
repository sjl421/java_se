package com.thinktik.demo23.thread;

/**
 * @author think
 * 2018年3月4日下午6:55:48
 */

/*
 * 实现多线程的第一种方法:继承Thread类
 * */

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main  "+i);
		}
	}
}
