package com.thinktik.demo26.proxy;

/**
 * @author think 2018年3月5日下午10:01:11
 */
public class UserImp implements User {

	@Override
	public void add() {
		// System.out.println("权限校验");
		System.out.println("添加功能");
		// System.out.println("日志记录");
	}

	@Override
	public void delete() {
		// System.out.println("权限校验");
		System.out.println("删除功能");
		// System.out.println("日志记录");
	}

}
