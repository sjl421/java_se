package com.thinktik.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo4_CollectionAll {

	/**
	 * * A:������ʾ
		* 
				��All�Ĺ�����ʾ
				boolean addAll(Collection c)
				boolean removeAll(Collection c)
				boolean containsAll(Collection c)
				boolean retainAll(Collection c)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		c2.add("f");
		
		//ȡ����,������õļ��ϸı�ͷ���true,������õļ��ϲ���ͷ���false
		boolean b = c1.retainAll(c2);					//ȡ����
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.containsAll(c2);				//�жϵ��õļ����Ƿ��������ļ���
		System.out.println(b);
	}

	public static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		
		boolean b = c1.removeAll(c2);					//ɾ�����ǽ���
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();			//alt + shift + r����
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		//c1.addAll(c2);							//��c2�е�ÿһ��Ԫ����ӵ�c1��
		c1.add(c2);									//��c2����һ��������ӵ�c1��
		System.out.println(c1);
	}

}
