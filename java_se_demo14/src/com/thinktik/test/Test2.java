package com.thinktik.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	/**
	 * * A:������ʾ
	 * ������һ��������������������?
	 * ����:
	 * 1,�������ַ����ͽ����ַ�������String���͵ı�����
	 * 2,�������ڸ�ʽ������
	 * 3,�������ַ���ת�������ڶ���
	 * 4,ͨ�����ڶ������ʱ�����ֵ
	 * 5,������ʱ�����ֵ�������1000,�ٳ���60,�ٳ���60,�ٳ���24�õ���
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//1,�������ַ����ͽ����ַ�������String���͵ı�����
		String birthday = "1983��07��08��";
		String today = "2088��6��6��";
		//2,�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//3,�������ַ���ת�������ڶ���
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		//4,ͨ�����ڶ������ʱ�����ֵ
		long time = d2.getTime() - d1.getTime();
		//5,������ʱ�����ֵ�������1000,�ٳ���60,�ٳ���60,�ٳ���24�õ���
		System.out.println(time / 1000 / 60 / 60 / 24 );
	}

}
