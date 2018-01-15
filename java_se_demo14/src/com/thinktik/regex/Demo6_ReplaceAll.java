package com.thinktik.regex;

public class Demo6_ReplaceAll {

	/**
	 * * A:������ʽ���滻����
	 * String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
	 */
	public static void main(String[] args) {
		String s = "wo111ai222heima";
		String regex = "\\d";			//\\d���������������
		
		String s2 = s.replaceAll(regex, "");
		System.out.println(s2);
	}

}
