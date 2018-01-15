package com.thinktik.generic;

public class Demo4_Generic {

	/**
	 * * A:���ͽӿڸ���
			* �ѷ��Ͷ����ڽӿ���
		* B:�����ʽ	
			* public interface �ӿ���<��������>
		* C:������ʾ
			* ���ͽӿڵ�ʹ��
	 */
	public static void main(String[] args) {

	}
}

interface Inter<T> {
	public void show(T t);
}

/*class Demo implements Inter<String> {		//�Ƽ�������

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}*/

class Demo<T> implements Inter<T> {			//û�б�Ҫ��ʵ�ֽӿڵ�ʱ����Լ���ӷ���

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}
