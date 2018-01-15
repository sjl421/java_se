package com.thinktik.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test4 {

	/**
	 * ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
	 * 
	 * ����:
	 * 1,����һ��List����,���洢�ظ���������ַ���
	 * 2,���巽�������������ظ�
	 * 3,��ӡList����
	 */
	public static void main(String[] args) {
		//1,����һ��List����,���洢�ظ���������ַ���
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbbb");
		list.add("aaa");
		list.add("aaa");
		
		//2,���巽�������������ظ�
		sort(list);
		
		//3,��ӡlist
		System.out.println(list);
	}
	
	/*
	 * ���巽��,���򲢱����ظ�
	 * ����:
	 * 1,����TreeSet���϶���,��ΪString����;߱��ȽϹ���,�����ظ����ᱣ��,���������ñȽ���
	 * 2,��list���������е�Ԫ����ӵ�TrreSet������,��������,�����ظ�
	 * 3,���list����
	 * 4,��TreeSet�������ź����Ԫ����ӵ�list��
	 */
	public static void sort(List<String> list) {
		//1,����TreeSet���϶���,��ΪString����;߱��ȽϹ���,�����ظ����ᱣ��,���������ñȽ���
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);					//�Ƚ�����Ϊ��Ҫ����
				return num == 0 ? 1 : num;					//�����ظ�
			}
		});
		//2,��list���������е�Ԫ����ӵ�TrreSet������,��������,�����ظ�
		ts.addAll(list);
		//3,���list����
		list.clear();
		//4,��TreeSet�������ź����Ԫ����ӵ�list��
		list.addAll(ts);
	}

}
