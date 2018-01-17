package com.thinktik.stringbuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:ͨ�����췽��
		* b:ͨ��append()����
	* B:StringBuffer -- String
		* a:ͨ�����췽��
		* b:ͨ��toString()����
		* c:ͨ��subString(0,length);

	 */
	public static void main(String[] args) {
		//demo1();
		StringBuffer sb = new StringBuffer("heima");
		
		String s1 = new String(sb);						//ͨ�����콫StringBufferת��ΪString
		System.out.println(s1);
		
		String s2 = sb.toString();						//ͨ��toString������StringBufferת��ΪString
		System.out.println(s2);
		
		String s3 = sb.substring(0, sb.length());		//ͨ����ȡ���ַ�����StringBufferת��ΪString
		System.out.println(s3);
	}

	private static void demo1() {
		StringBuffer sb1 = new StringBuffer("heima");			//ͨ�����췽�����ַ���ת��ΪStringBuffer����
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("heima");									//ͨ��append�������ַ���ת��ΪStringBuffer����
		System.out.println(sb2);
	}

}
