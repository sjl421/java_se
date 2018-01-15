package com.thinktik.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.thinktik.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_Collection {

	/**
	 * * A:������ʾ	
		* 
				����������ʾ
				
				boolean add(E e)
				boolean remove(Object o)
				void clear()
				boolean contains(Object o)
				boolean isEmpty()
				int size()
		
		* B:ע��:
		* 
				collectionXxx.javaʹ����δ�����򲻰�ȫ�Ĳ���.
				ע��:Ҫ�˽���ϸ��Ϣ,��ʹ�� -Xlint:unchecked���±���.
				java��������Ϊ�ó�����ڰ�ȫ����
				��ܰ��ʾ:�ⲻ�Ǳ���ʧ��,�����Ȳ������,��ѧ�˷������֪����
		add���������List����һֱ������true,��ΪList�������ǿ��Դ洢�ظ�Ԫ�ص�
		�����Set���ϵ��洢�ظ�Ԫ�ص�ʱ��,�ͻ᷵��false
		
		ArrayList�ĸ���ĸ�����дtoString����,�����ڴ�ӡ��������õ�ʱ��,����Ľ������Object����toString�Ľ��
	 */
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();		
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//c.remove("b");										//ɾ��ָ��Ԫ��
		//c.clear();											//��ռ���
		//System.out.println(c.contains("b"));					//�ж��Ƿ����
		//System.out.println(c.isEmpty());
		System.out.println(c.size()); 							//��ȡԪ�صĸ���
		System.out.println(c);
	}

	public static void demo1() {
		Collection c = new ArrayList();						//��������ָ���������
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);							//�Զ�װ��new Boolean(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("����",23));			
		boolean b5 = c.add("abc");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c.toString());
	}

}
