package com.thinktik.list;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1_ArrayList {

	/**
	 * * A:������ʾ
		* ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
		* ˼·�������¼��Ϸ�ʽ
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}

	/*
	 * �����¼��Ͻ��ظ�Ԫ��ȥ��
	 * 1,��ȷ����ֵ����,����ArrayList
	 * 2,��ȷ�����б�ArrayList
	 * 
	 * ����:
	 * 1,�����¼���
	 * 2,���ݴ���ļ���(�ϼ���)��ȡ������
	 * 3,�����ϼ���
	 * 4,ͨ���¼����ж��Ƿ�����ϼ����е�Ԫ��,��������Ͳ����,��������������
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList<>();					//1,�����¼���
		Iterator it = list.iterator();							//2,���ݴ���ļ���(�ϼ���)��ȡ������
		
		while(it.hasNext()) {									//3,�����ϼ���
			Object obj = it.next();								//��¼סÿһ��Ԫ��
			if(!newList.contains(obj)) {						//����¼����в������ϼ����е�Ԫ��
				newList.add(obj);								//����Ԫ�����
			}
		}
		
		return newList;
	}
}
