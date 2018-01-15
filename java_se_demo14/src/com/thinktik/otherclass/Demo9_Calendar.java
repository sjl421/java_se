package com.thinktik.otherclass;

import java.util.Calendar;

public class Demo9_Calendar {

	/**
	 * * A:Calendar��ĸ���
			* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
		* B:��Ա����
			* public static Calendar getInstance()
			* public int get(int field)
		* C:��Ա����
			* public void add(int field,int amount)
			* public final void set(int year,int month,int date)
		* D:������ʾ
			* Calendar��ĳ�Ա����ʹ��
	 */
	public static void main(String[] args) {
		//demo1();
		Calendar c = Calendar.getInstance();			//��������ָ���������
		//c.add(Calendar.MONTH, -1);					//��ָ�����ֶν�����ǰ��������
		//c.set(Calendar.YEAR, 2000);					//�޸�ָ���ֶ�
		c.set(2000, 7, 8);
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH)+1)) 
				+ "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	public static void demo1() {
		Calendar c = Calendar.getInstance();			//��������ָ���������
		//System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));		//ͨ���ֶλ�ȡ��
		System.out.println(c.get(Calendar.MONTH));		//ͨ���ֶκ�����,�������Ǵ�0��ʼ��ŵ�
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//���еĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//�����ǵ�һ��,���������һ��
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH)+1)) 
				+ "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * �����ڴ洢���н��в��
	 * 1,����ֵ����String
	 * 2,�����б�int week
	 */
	
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		
		return arr[week];
	}
	
	/*
	 * ����Ǹ�������ǰ�油0
	 * 1,����ֵ����String����
	 * 2,�����б�,int num
	 */
	public static String getNum(int num) {
		/*if(num > 9) {
			return "" + num;
		}else {
			return "0" + num;
		}*/
		return num > 9 ? "" + num : "0" + num;
	}
}
