package com.thinktik.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	/**
	 * * A:DateFormat��ĸ���
			* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
		* B:SimpleDateFormat���췽��
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:��Ա����
			* public final String format(Date date)
			* public Date parse(String source)
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		
		//��ʱ���ַ���ת�������ڶ���
		String str = "2000��08��08�� 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d = sdf.parse(str);						//��ʱ���ַ���ת�������ڶ���
		System.out.println(d);
	}

	public static void demo3() {
		Date d = new Date();							//��ȡ��ǰʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//�������ڸ�ʽ�������
		System.out.println(sdf.format(d));				//�����ڶ���ת��Ϊ�ַ���
	}

	public static void demo2() {
		Date d = new Date();							//��ȡ��ǰʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat();	//�������ڸ�ʽ�������
		System.out.println(sdf.format(d));	 			//88-6-6 ����9:31
	}

	public static void demo1() {
		//DateFormat df = new DateFormat();				//DateFormat�ǳ�����,������ʵ����
		//DateFormat df1 = new SimpleDateFormat();
		DateFormat df1 = DateFormat.getDateInstance();	//�൱�ڸ�������ָ���������,�ұߵķ�������һ���������
	}

}
