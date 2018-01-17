package com.thinktik.wrapclass;

public class Demo4_JDK5 {

	/**
	 * * A:JDK5��������
			* �Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
			* �Զ����䣺�Ѱ�װ������ת��Ϊ��������
		* B:������ʾ
			* JDK5���������Զ�װ��Ͳ���
			
			* Integer ii = 100;
			* ii += 200;
		* C:ע������
			* ��ʹ��ʱ��Integer  x = null;����ͻ����NullPointerException��
			* �������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
	 */
	public static void main(String[] args) {
//		int x = 100;
//		Integer i1 = new Integer(x);			//�������������Ͱ�װ�ɶ���,װ��
//		
//		int y = i1.intValue();					//������ת��Ϊ������������,����
		
		Integer i2 = 100;						//�Զ�װ��,�ѻ�����������ת���ɶ���
		int z = i2 + 200;						//�Զ�����,�Ѷ���ת��Ϊ������������
		System.out.println(z);
		
		Integer i3 = null;
		int a = i3 + 100;						//�ײ���i3����intValue,����i3��null,null���÷����ͻ����
		System.out.println(a);					//��ָ���쳣java.lang.NullPointerException
	}

}
