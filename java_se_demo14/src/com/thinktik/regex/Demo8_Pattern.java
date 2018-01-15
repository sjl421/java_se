package com.thinktik.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Pattern {

	/**
	 * Pattern p = Pattern.compile("a*b");
		 Matcher m = p.matcher("aaaaab");
		 boolean b = m.matches();
		 
		* A:������ʽ�Ļ�ȡ����
			* Pattern��Matcher�Ľ��ʹ��
		* B:������ʾ
			* ���󣺰�һ���ַ����е��ֻ������ȡ����
	 */
	public static void main(String[] args) {
		//demo1();
		String s = "�ҵ��ֻ���18988888888,�����ù�18987654321,���ù�18812345678";
		String regex = "1[3578]\\d{9}";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		
		/*boolean b1 = m.find();
		System.out.println(b1);
		System.out.println(m.group());
		
		boolean b2 = m.find();
		System.out.println(b2);
		System.out.println(m.group());*/
		
		while(m.find())
			System.out.println(m.group());
	}

	public static void demo1() {
		Pattern p = Pattern.compile("a*b");					//��ȡ��������ʽ
		Matcher m = p.matcher("aaaaab");					//��ȡƥ����
		boolean b = m.matches();							//���Ƿ���ƥ��,ƥ��ͷ���true
		
		System.out.println(b);
		
		System.out.println("aaaaab".matches("a*b"));  		//������Ľ��һ��
	}

}
