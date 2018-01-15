package com.thinktik.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/**
	 * * A:������ʾ
	 * ���󣺼���¼������һ����ݣ��жϸ��������껹��ƽ��
	 * Calendar c = Calendar.getInstance();
	 * 
	 * ����:
	 * 1,����¼����Scanner
	 * 2,����Calendar c = Calendar.getInstance();
	 * 3,ͨ��set��������Ϊ��һ���3��1��
	 * 4,������ǰ��ȥ1
	 * 5,�ж����Ƕ�����,�����29�췵��true���򷵻�false
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������,�жϸ���������껹��ƽ��:");
		//int year = sc.nextInt();
		
		String line = sc.nextLine();				//¼�������ַ���
		int year = Integer.parseInt(line);			//�������ַ���ת��������
		boolean b = getYear(year);
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		//2,����Calendar c = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//����Ϊ��һ���3��1��
		c.set(year, 2, 1);
		//������ǰ��ȥ1
		c.add(Calendar.DAY_OF_MONTH, -1);
		//�ж��Ƿ���29��
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
