package com.thinktik.test;

import java.util.Scanner;

public class Test2 {

	/**
	 * * A:������ʾ
	* 
			���󣺰��ַ�����ת
				����������¼��"abc"		
				��������"cba"
				
			��StringBuffer�Ĺ���ʵ��	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		String line = sc.nextLine();						//������¼����ַ����洢��line��
		
		/*StringBuffer sb = new StringBuffer(line);			//���ַ���ת��ΪStringBuffer����
		sb.reverse();										//�������������ݷ�ת
		
		System.out.println(sb.toString());*/
		
		System.out.println(revString(line));
	}

	/*
	 * ���ַ�����ת
	 * 1,����ֵ����String
	 * 2,�����б�String line
	 */
	
	public static String revString(String line) {
		StringBuffer sb = new StringBuffer(line);			//���ַ���ת��ΪStringBuffer����
		sb.reverse();										//�������������ݷ�ת
		
		return sb.toString();
	}
}
