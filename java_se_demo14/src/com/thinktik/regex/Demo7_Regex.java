package com.thinktik.regex;

public class Demo7_Regex {

	/**
	 * * A:������ʽ�ķ��鹦��
			* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
		* 
				1     ((A)(B(C))) 
				2     (A 
				3     (B(C)) 
				4     (C) 
			
				����ʼ�մ����������ʽ��
		B:������ʾ
			a:�и�
				�����밴�յ����и "sdqqfgkkkhjppppkl";
			b:�滻
				��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
				���ַ�����ԭ��:����Ҫѧ��̡���
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		
		/*
		 * ��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
				���ַ�����ԭ��:����Ҫѧ��̡���
		 */
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");	//$1�����һ���е�����
		System.out.println(s3);
	}

	public static void demo2() {
		//�����밴�յ����и "sdqqfgkkkhjppppkl";
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";					//+�����һ�����һ�ε����
		String[] arr = s.split(regex);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void demo1() {
		//���� �������,�߸�����
		/*String regex = "(.)\\1(.)\\2";					//\\1�����һ���ֳ���һ��	\\2����ڶ����ֳ���һ��
		System.out.println("�������".matches(regex));
		System.out.println("��������".matches(regex));
		System.out.println("�߸�����".matches(regex));
		System.out.println("��������".matches(regex));*/
		
		//���� ��������,���˸���
		String regex2 = "(..)\\1";
		System.out.println("��������".matches(regex2));
		System.out.println("���˸���".matches(regex2));
		System.out.println("�������".matches(regex2));
	}

}
