package com.thinktik.wrapclass;

public class Demo3_Integer {

	/**
	 * * A:int -- String
			* a:��""����ƴ��
			* b:public static String valueOf(int i)
			* c:int -- Integer -- String(Integer���toString����())
			* d:public static String toString(int i)(Integer��ľ�̬����)
		* B:String -- int
			* a:String -- Integer -- int
				* public static int parseInt(String s)
		�����������Ͱ�װ���а���,�������ֶ���parseXxx�ķ���,���Խ������ֵ��ַ���������ʽת���ɻ�����������
	 */
	public static void main(String[] args) {
		
		//demo1();
		String s1 = "true";
		boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);
		
		//String s2 = "abc";
		//char c = Character.p		//char�İ�װ��Character��û��pareseXxx�ķ���
									//�ַ������ַ���ת��ͨ��toCharArray()�Ϳ��԰��ַ���ת��Ϊ�ַ�����
	}

	private static void demo1() {
		//int ----> String intת����String
		int i = 100;
		String s1 = i + "";						//�Ƽ���
		String s2 = String.valueOf(i);			//�Ƽ���
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		
		String s4 = Integer.toString(i);
		System.out.println(s1);
		
		//String----> int String ת��int
		String s = "200";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();					//��Integerת������int��
		
		int i5 = Integer.parseInt(s);			//��Stringת��Ϊint,�Ƽ�������
	}

}
