package com.thinktik.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.thinktik.bean.Student;

public class Demo5_Iterator {

	/**
	 * ����
	 * * A:����������
	 * �����������洢Ԫ��,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ����(����) 
	 */
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("����", 23));				//Object obj = new Student("����",23);
		c.add(new Student("����", 24));
		c.add(new Student("����", 25));
		c.add(new Student("����", 26));
		
		//��ȡ������
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();			//����ת��
			System.out.println(s.getName() + "..." + s.getAge());
		}
	
	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//�Լ����е�Ԫ�ص���(����)
		Iterator it = c.iterator();					//��ȡ������
		/*boolean b1 = it.hasNext();					//�жϼ������Ƿ���Ԫ��,�оͷ���true
		Object obj1 = it.next();
		System.out.println(b1);
		System.out.println(obj1);
		
		boolean b2 = it.hasNext();					//�жϼ������Ƿ���Ԫ��,�оͷ���true
		Object obj2 = it.next();
		System.out.println(b2);
		System.out.println(obj2);*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
