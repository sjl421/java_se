package com.thinktik.list;

import java.util.LinkedList;

public class Demo4_LinkedList {

	/**
	 * ��LinkedListģ��ջ�ṹ
	 */
	public static void main(String[] args) {
		//demo1();
		Stack s = new Stack();
		s.in("a");								//��ջ
		s.in("b");
		s.in("c");
		s.in("d");
		
		while(!s.isEmpty()) {					//�ж�ջ�ṹ�Ƿ�Ϊ��
			System.out.println(s.out());		//��ջ
		}
	}

	public static void demo1() {
		LinkedList list = new LinkedList();					//�������϶���
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		
		/*System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());*/
		
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}
