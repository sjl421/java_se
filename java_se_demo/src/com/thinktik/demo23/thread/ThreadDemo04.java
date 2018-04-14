package com.thinktik.demo23.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author think
 * 2018年3月4日下午8:07:09
 */

/*
 * 实现多线程的第三种方法:实现Callable接口
 * */
public class ThreadDemo04 {
	public static void main(String[] args) {
		MyCallable callable = new MyCallable();
		
		FutureTask<String> futureTask = new FutureTask<>(callable);
		
		new Thread(futureTask).start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main  "+i);
		}
		
		try {
			String result = futureTask.get();
			System.out.println("result :"+result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
