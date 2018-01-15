package com.thinktik.test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	/**
	 * * A:������ʾ
	 * ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
	 * 
	 * ����:
	 * 1,��Random�ഴ�����������
	 * 2,��Ҫ�洢10�������,���Ҳ����ظ�,����������HashSet����
	 * 3,���HashSet��size��С��10�Ϳ��Բ��ϵĴ洢,������ڵ���10��ֹͣ�洢
	 * 4,ͨ��Random���е�nextInt(n)������ȡ1��20֮��������,������Щ������洢��HashSet������
	 * 5,����HashSet
	 */
	public static void main(String[] args) {
		//1,��Random�ഴ�����������
		Random r = new Random();
		//2,��Ҫ�洢10�������,���Ҳ����ظ�,����������HashSet����
		HashSet<Integer> hs = new HashSet<>();
		//3,���HashSet��size��С��10�Ϳ��Բ��ϵĴ洢,������ڵ���10��ֹͣ�洢
		while(hs.size() < 10) {
			//4,ͨ��Random���е�nextInt(n)������ȡ1��20֮��������,������Щ������洢��HashSet������
			hs.add(r.nextInt(20) + 1);
		}
		// 5,����HashSet
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
	}

}
