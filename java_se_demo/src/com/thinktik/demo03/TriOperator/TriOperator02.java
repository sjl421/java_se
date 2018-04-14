package com.thinktik.demo03.TriOperator;

import java.util.Scanner;

/**
 * @author think 2018年1月13日下午10:40:51
 * 
 */
public class TriOperator02 {
	public static void main(String[] args) {

		//录入两个整数
		Scanner sc = new Scanner(System.in);			//创建键盘录入对象
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();							//将键盘录入的数据存储在x中
		System.out.println(x);

		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();
		int z = (x > y) ? x : y;//将键盘录入的数据存储在y中
		System.out.println(z);
		sc.close();
	}
}
