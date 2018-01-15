package com.thinktik.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4_ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");									//Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
		ListIterator lit = list.listIterator();			//��ȡ������
		while(lit.hasNext()) {
			System.out.println(lit.next()); 			//��ȡԪ�ز���ָ������ƶ�
		}
		
		System.out.println("-----------------");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()); 		//��ȡԪ�ز���ָ����ǰ�ƶ�
		}
	}

}
