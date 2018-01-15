package com.thinktik.list;

import java.util.ArrayList;
import java.util.List;

import com.thinktik.bean.Student;

public class Demo2_List {

	/**
	 * * A:������ʾ
	 * ��List�����д洢ѧ������
	 * ͨ��size()��get()�������ʹ�ñ�����
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("����", 23));					//Object obj = new Student("����",23);
		list.add(new Student("����", 24));
		list.add(new Student("����", 25));
		list.add(new Student("����", 26));
		
		for(int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));	 			//ͨ��������ȡÿһ��Ԫ��
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

}
