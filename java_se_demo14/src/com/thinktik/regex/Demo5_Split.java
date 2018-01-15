package com.thinktik.regex;

public class Demo5_Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "������.������.��dayone";
		String[] arr = s.split("\\.");				//ͨ��������ʽ�и��ַ���
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("11111111111111111");
	}

}
