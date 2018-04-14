package com.thinktik.demo23.thread;

/**
 * @author think 2018年3月4日下午7:53:52
 */

/*
 * 对于前两种的总结  匿名对象实现
 * */
public class ThreadDemo03 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {		
					System.out.println("Thread   "+i);
				}
			}
		}.start();;
		
		new Thread(
			new Runnable() {
				@Override
				public void run() {
					for(int i = 0; i < 1000; i++) {		
						System.out.println("Runnable   "+i);
					}				
				}
		}).start();;

	}
}
