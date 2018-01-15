package com.thinktik.wrapclass;

public class Demo2_Integer {

	/**
	 * * A:Integer�����
			* ͨ��JDK�ṩ��API���鿴Integer���˵��
		
			* Integer ���ڶ����а�װ��һ���������� int ��ֵ,
			* �����ṩ�˶������������ int ���ͺ� String ����֮�以��ת����
			* ���ṩ�˴��� int ����ʱ�ǳ����õ�����һЩ�����ͷ���
		* B:���췽��
			* public Integer(int value)
			* public Integer(String s)
		* C:������ʾ
			* ʹ�ù��췽����������
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//Integer i2 = new Integer("abc");			//java.lang.NumberFormatException���ָ�ʽ�쳣
		//System.out.println(i2);						//��Ϊabc���������ַ���,����ת���ᱨ��
		
		Integer i3 = new Integer("100");
		System.out.println(i3);
	}

}
