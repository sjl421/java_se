package com.thinktik.demo23.threadmethod;

public class ThreadSleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "...Thread1");
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName() + "...Thread2");
				}
			}
		}.start();
	}

	public static void demo1() throws InterruptedException {
		for(int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("倒计时第" +i + "秒");
		}
	}

}
