package com.thinktik.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	/**
	 * * ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	 * aaaabbbcccddd
	 * 
	 * ����:
	 * 1,����Scanner����
	 * 2,����HashSet����,���ַ��洢,ȥ���ظ�
	 * 3,���ַ���ת��Ϊ�ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�
	 * 4,����HashSet,��ӡÿһ���ַ�
	 */
	public static void main(String[] args) {
		//1,����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		//2,����HashSet����,���ַ��洢,ȥ���ظ�
		HashSet<Character> hs = new HashSet<>();
		//3,���ַ���ת��Ϊ�ַ�����,��ȡÿһ���ַ��洢��HashSet������,�Զ�ȥ���ظ�
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr) {							//�����ַ�����
			hs.add(c);
		}
		
		//4,����HashSet,��ӡÿһ���ַ�
		
		for(Character ch : hs) {
			System.out.print(ch);
		}
	}

}
