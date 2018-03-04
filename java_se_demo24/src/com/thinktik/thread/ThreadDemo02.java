package com.thinktik.thread;

/**
 * @author think
 * 2018年3月4日下午7:40:56
 */


/*
 * 实现多线程的第二种方法:实现Runnable接口
 * */
public class ThreadDemo02 {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main  "+i);
		}
	}
}
