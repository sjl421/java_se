package com.thinktik.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

	/**
	 * @param args
	 * LinkedHashSet
	 * �ײ�������ʵ�ֵ�,��set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
	 * ��Ϊ��HashSet������,����Ҳ�Ǳ�֤Ԫ��Ψһ��,��HashSet��ԭ��һ��
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		
		System.out.println(lhs);
	}

}
