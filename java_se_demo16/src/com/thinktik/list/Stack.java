package com.thinktik.list;

import java.util.LinkedList;

public class Stack {
	private LinkedList list = new LinkedList();
	
	/*
	 * ģ���ջ����
	 */
	public void in(Object obj) {
		list.addLast(obj);
	}
	
	/*
	 * ģ���ջ
	 */
	public Object out() {
		return list.removeLast();
	}
	
	/*
	 * ģ��ջ�ṹ�Ƿ�Ϊ��
	 */
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
