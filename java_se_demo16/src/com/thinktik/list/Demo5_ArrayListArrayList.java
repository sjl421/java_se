package com.thinktik.list;

import java.util.ArrayList;

import com.thinktik.bean.Person;

public class Demo5_ArrayListArrayList {

	/**
	 * * A:������ʾ
	 * ����Ƕ��֮ArrayListǶ��ArrayList
	 * ����:
	 * ����ѧ��,ѧ���ַ�Ϊ�����༶
	 * ����ѧ��һ���󼯺�
	 * ���ɸ��༶��Ϊÿһ��С����
	 */
	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		
		ArrayList<Person> first = new ArrayList<>();				//������һ���༶
		first.add(new Person("����", 30));
		first.add(new Person("�����", 33));
		first.add(new Person("������", 20));
		
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("������", 31));
		second.add(new Person("��ޱ", 33));
		second.add(new Person("����", 32));
		
		//���༶��ӵ�ѧ�Ƽ�����
		list.add(first);
		list.add(second);
		
		//����ѧ�Ƽ���
		for(ArrayList<Person> a : list) {
			for(Person p : a) {
				System.out.println(p);
			}
		}
	}

}
