package com.thinktik.stringbuffer;

public class Demo2_StringBuffer {

	/**
	 * * A:StringBuffer����ӹ���
		* public StringBuffer append(String str):
			* ���԰���������������ӵ��ַ�������������,�������ַ�������������
		* public StringBuffer insert(int offset,String str):
			* ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ������Ϊ16���ַ�����
		��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�
	 */
	public static void main(String[] args) {
		//demo1();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");						//��ָ��λ�����Ԫ��,���û��ָ��λ�õ������ͻᱨ����Խ���쳣
		
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		
		
		System.out.println(sb.toString());			//StringBuffer������д��toString����,��ʾ���Ƕ����е�����ֵ
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}

}
