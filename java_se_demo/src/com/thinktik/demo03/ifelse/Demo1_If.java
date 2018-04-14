package com.thinktik.demo03.ifelse;


/**
 * @author think
 * 2018年1月13日下午10:52:26
 * 
 */

/*
* C:if语句的格式1
* 
		if(比较表达式) {
			语句体;
		}
* D:执行流程：
	* 先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体；
	* 如果是false，就不执行语句体；
*/

//加public表示全局类，该类可以import到任何类内。不加public默认为保留类，只能被同一个包内的其他类引用。
class Demo1_If {
	public static void main(String[] args) {
		int age = 17;

		if (age >= 18) {
			System.out.println("可以浏览本网站");
		}

		System.out.println("完了");
	}
}
