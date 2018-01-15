package com.thinktik.otherclass;

import java.util.Calendar;

public class Demo8_Calendar {

	/**
	 * * A:Calendar��ĸ���
			* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
		* B:��Ա����
			* public static Calendar getInstance()
			* public int get(int field)
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		//��������ָ���������
		//System.out.println(c);					//֤����д��toString������ӡ�˶��������е�����
		System.out.println(c.get(Calendar.YEAR));  	//ͨ���ֶλ�ȡ��Ӧ��ֵ
		System.out.println(c.get(Calendar.MONTH));
	}

}
