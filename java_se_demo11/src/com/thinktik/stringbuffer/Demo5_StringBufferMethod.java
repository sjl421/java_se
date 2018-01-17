package com.thinktik.stringbuffer;

public class Demo5_StringBufferMethod {

	/**
	 * * A:StringBuffer�Ľ�ȡ����
		* public String substring(int start):
			* ��ָ��λ�ý�ȡ��ĩβ
		* public String substring(int start,int end):
			* ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
	* B:ע������
		* ע��:����ֵ���Ͳ�����StringBuffer����
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("woaiheima");
		//String str = sb.substring(4);
		//System.out.println(str);
		
		//System.out.println(sb);
		
		String str3 = sb.substring(4, 7);
		System.out.println(str3);
	}

}
