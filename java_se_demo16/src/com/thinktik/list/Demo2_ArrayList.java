package com.thinktik.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.thinktik.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_ArrayList {

	/**
	 * * A:������ʾ
			* ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
		* B:ע������
			* ��дequals()������
		contains�����ж��Ƿ����,�ײ���������equals����
		remove�����ж��Ƿ�ɾ��,�ײ���������equals����
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();				//�������϶���
		list.add(new Person("����", 23));
		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		
		//ArrayList newList = getSingle(list);			//���÷���ȥ���ظ�
		//System.out.println(newList);
		list.remove(new Person("����", 23));
		System.out.println(list);
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
