package com.thinktik.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	/**
	 * �Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������: helloitcast�����ӡ:acehillostt
	 * ����:
	 * 1,����¼���ַ���,Scanner
	 * 2,���ַ���ת��Ϊ�ַ�����
	 * 3,����TreeSet����,����Ƚ������ַ����򲢱����ظ�
	 * 4,�����ַ�����,��ÿһ���ַ��洢��TreeSet������
	 * 5,����TreeSet����,��ӡÿһ���ַ�
	 */
	public static void main(String[] args) {
		//1,����¼���ַ���,Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line = sc.nextLine();
		//2,���ַ���ת��Ϊ�ַ�����
		char[] arr = line.toCharArray();
		//3,����TreeSet����,����Ƚ������ַ����򲢱����ظ�
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				//int num = c1 - c2;				//�Զ�����
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}
		});
		
		//4,�����ַ�����,��ÿһ���ַ��洢��TreeSet������
		for(char c : arr) {
			ts.add(c);							//�Զ�װ��
		}
		
		//5,����TreeSet����,��ӡÿһ���ַ�
		for(Character c : ts) {
			System.out.print(c);
		}
	}

}
