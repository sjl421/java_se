package com.thinktik.otherclass;

import java.util.Date;

public class Demo6_Date {

	/**
	 * * A:Date��ĸ�����util���µ�,���ܵ���sql����
			* �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
		* B:���췽��
			* public Date()
			* public Date(long date)
		* C:��Ա����
			* public long getTime()
			* public void setTime(long time)
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Date d1 = new Date();	
		d1.setTime(1000);								//���ú���ֵ,�ı�ʱ�����
		System.out.println(d1);
	}

	public static void demo2() {
		Date d1 = new Date();	
		System.out.println(d1.getTime());				//ͨ��ʱ������ȡ����ֵ
		System.out.println(System.currentTimeMillis());	//ͨ��ϵͳ��ķ�����ȡ��ǰʱ�����ֵ
	}

	public static void demo1() {
		Date d1 = new Date();					//���û�д�����������ǵ�ǰʱ��
		System.out.println(d1);
		
		Date d2 = new Date(0);					//������췽���в�����Ϊ0�������1970��1��1��
		System.out.println(d2);					//ͨ������ֵ����ʱ�����
	}

}
