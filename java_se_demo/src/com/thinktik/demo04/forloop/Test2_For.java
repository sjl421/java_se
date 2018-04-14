package com.thinktik.demo04.forloop;

/*
* A:案例演示
	* 需求：求出1-10之间数据之和
* B:学生练习
	* 需求：求出1-100之间偶数和
	* 需求：求出1-100之间奇数和

	分析:1-10数据的和
	0 + 1
		1 + 2
			3 + 3
				6
				...
*/
/**
 * @author think
 * 2018年1月16日下午11:45:24
 * 
 */
class Test2_For {
	public static void main(String[] args) {
		//1-10的和
		int sum1 = 0;
		for (int i1 = 1;i1 <= 10 ;i1++ ) {
			sum1 = sum1 + i1;
		}
		System.out.println("sum = " + sum1);

		//1-100的偶数和
		int sum2 = 0;
		for (int i2 = 1;i2 <= 100 ;i2++ ) {
			if (i2 % 2 == 0) {
				sum2 = sum2 + i2;
			}
		}
		System.out.println("sum = " + sum2);

		//1-100的奇数和
		int sum3 = 0;
		for (int i3 = 1;i3 <= 100 ;i3+=2 ) {
			if (i3 % 2 != 0) {
				sum3 = sum3 + i3;
			}
			sum3 = sum3 + i3;
		}

		System.out.println("sum = " + sum3);
	}
}
