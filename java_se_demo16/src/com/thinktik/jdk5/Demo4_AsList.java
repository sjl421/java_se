package com.thinktik.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	/**
	 * ����ת���ɼ���
	 * ����ת���ɼ�����Ȼ�������ӻ����Ԫ��,���ǿ����ü��ϵ�˼���������,Ҳ����˵����ʹ�����������еķ���
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//����ת����,�ӷ��͵�
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[10]);		//������ת������ʱ,���鳤�������С�ڵ��ڼ��ϵ�sizeʱ,ת��������鳤�ȵ��ڼ��ϵ�size
															//�������ĳ��ȴ�����size,��������鳤�Ⱦͺ���ָ���ĳ���һ��
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void demo2() {
		//int[] arr = {11,22,33,44,55};			
		//List<int[]> list = Arrays.asList(arr);			�����������͵�����ת���ɼ���,�Ὣ�������鵱��һ������ת��
		//System.out.println(list);
		Integer[] arr = {11,22,33,44,55};					//������ת���ɼ���,���������������������
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
	}

	public static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);				//������ת���ɼ���
		//list.add("d");									//�������
		System.out.println(list);
	}

}
