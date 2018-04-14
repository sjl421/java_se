package com.thinktik.demo04.controller;

/**
 * @author think
 * 2018年1月16日下午11:43:46
 * 
 */
class Demo4_Return {
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {				
				//break;						//停止循环
				return;							//返回的意思,用来返回方法结果  直接结束方法
			}
		}

		System.out.println("循环结束了");
	}
}
