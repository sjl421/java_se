package com.thinktik.set;

import java.util.HashSet;

import com.thinktik.bean.Person;

public class Demo1_HashSet {

	/**
	 * @param args
	 * Set����,������,�������ظ�,����(��ȡ��һ��)
	 */
	public static void main(String[] args) {
		//demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 24));
		
		//System.out.println(hs.size());
		System.out.println(hs);
	}

	public static void demo1() {
		HashSet<String> hs = new HashSet<>();					//����HashSet����
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");								//����set�����д洢�ظ�Ԫ�ص�ʱ�򷵻�Ϊfalse
		hs.add("b");
		hs.add("c");
		hs.add("d");
		System.out.println(hs);									//HashSet�ļ̳���ϵ������дtoString����
		System.out.println(b1);
		System.out.println(b2);
		
		for (String string : hs) {								//ֻҪ���õ�����������,�Ϳ���ʹ����ǿforѭ������
			System.out.println(string);
		}
	}

}
