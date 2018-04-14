package com.thinktik.demo04.dowhileloop;

/*
* A:循环结构do...while语句的格式：
* 
		do {
			循环体语句;
		}while(判断条件语句);
		
		完整格式；
		初始化语句;
		do {
			循环体语句;
			控制条件语句;
		}while(判断条件语句);
* B:执行流程：
	* a:执行初始化语句
	* b:执行循环体语句;
	* c:执行控制条件语句
	* d:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* e:回到b继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10
*/
/**
 * @author think 2018年1月16日下午11:44:31
 * 
 */
class Demo1_DoWhile {
	public static void main(String[] args) {
		// while 和do while的区别
		int i1 = 11;
		do {
			System.out.println("i = " + i1);
			i1++;
		} while (i1 <= 10);

		System.out.println("---------------------");

		int i2 = 11;
		while (i2 <= 10) {
			System.out.println("i2 = " + i2);
			i2++;
		}

		int i3 = 0;
		//for (int i3 = 1; i3 <= 10; i3++) { // error for 循环里面定义的i3 作用域在for循环代码块里里面,但是确是定义在
		for (i3 = 1; i3 <= 10; i3++) {
			System.out.println("i3 = " + i3);
		}
		System.out.println("i3 = " + i3); // for语句执行后变量会被释放,不能再使用
		System.out.println("-------------------");

		int i4 = 1;
		while (i4 <= 10) {
			System.out.println("i4 = " + i4);
			i4++;
		}
		System.out.println("i = " + i4);// while语句执行后,初始化变量还可以继续使用
		System.out.println("-------------------");

		// while语句的无限循环

/*		while (true) {
			System.out.println("hello world");
		}*/

		// for语句的无限循环
		/*
		 * for (;;) { System.out.println("hello world"); }
		 */
	}
}
