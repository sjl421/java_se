package com.thinktik.proxy;

/**
 * @author think 2018年3月5日下午10:00:42
 */
public class StudentImp implements Student {

	@Override
	public void login() {
		System.out.println("登录");
	}

	@Override
	public void submit() {
		System.out.println("提交");
	}

}
