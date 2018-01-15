package com.thinktik.test;

import java.util.Arrays;

public class Test1 {

	/**
	 * @param args
	 * * A:������ʾ
	 * ������������һ���ַ���:��91 27 46 38 50������д����ʵ�������������ǣ���27 38 46 50 91��
	 * 100
	 * 80
	 * ����:
	 * 1,���ַ����и���ַ�������
	 * 2,���ַ���ת�������ֲ�����洢��һ���ȳ��ȵ�int������
	 * 3,����
	 * 4,�������Ľ��������ƴ�ӳ�һ���ַ���
	 */
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		//1,���ַ����и���ַ�������
		String[] sArr = s.split(" ");
		//2,���ַ���ת�������ֲ�����洢��һ���ȳ��ȵ�int������
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]); 	//�������ַ���ת��������
		}
		
		//3,����
		Arrays.sort(arr);
		
		//4,�������Ľ��������ƴ�ӳ�һ���ַ���27 38 46 50 91
		/*String str = "";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				str = str + arr[i];				//27 38 46 50 91
			}else {
				str = str + arr[i] + " ";		//27 38 46 50 
			}
		}
		
		System.out.println(str);*/
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i] + " ");
			}
		}
		
		System.out.println(sb);
	}

}
