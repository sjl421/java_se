package com.thinktik.thread;

public class MyThread extends Thread{
	//1,继承Thread
	//2,重写run方法
	//3,将要执行的代码写在run方法中
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("MyThread   "+i);
		}
	}
	
}
