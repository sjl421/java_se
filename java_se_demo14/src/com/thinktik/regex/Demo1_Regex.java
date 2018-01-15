package com.thinktik.regex;

public class Demo1_Regex {

	/**
	 * * A:������ʽ
			* ��ָһ��������������ƥ��һϵ�з���ĳ���﷨������ַ����ĵ����ַ�������ʵ����һ�ֹ������Լ������Ӧ�á�
			* ����:����ע������,�������û���������,һ���������Ƴ���,������Ƴ��ȵ��������������ʽ����
		* B:������ʾ
			* ����У��qq����.
				* 1:Ҫ�������5-15λ����
				* 2:0���ܿ�ͷ
				* 3:���붼������
				
			* a:��������ʽʵ��
			* b:������ʽʵ��
	 */
	public static void main(String[] args) {
		System.out.println(checkQQ("012345"));
		System.out.println(checkQQ("a1b345"));
		System.out.println(checkQQ("123456"));
		System.out.println(checkQQ("1234567890987654321"));
		
		String regex = "[1-9]\\d{4,14}";
		System.out.println("2553868".matches(regex));
		System.out.println("012345".matches(regex));
		System.out.println("2553868abc".matches(regex));
	}
	
	/*
	 * ����У��qq����.
	 * 1:Ҫ�������5-15λ����
	 * 2:0���ܿ�ͷ
	 * 3:���붼������
	 * У��qq
	 * 1,��ȷ����ֵ����boolean
	 * 2,��ȷ�����б�String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;					//���У��qq������Ҫ��Ͱ�flag��Ϊfalse,�������Ҫ��ֱ�ӷ���
		
		if(qq.length() >= 5 && qq.length() <= 15) {
			if(!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();	//���ַ���ת�����ַ�����
				for (int i = 0; i < arr.length; i++) {
					char ch = arr[i];			//��¼ÿһ���ַ�
					if(!(ch >= '0' && ch <= '9')) {
						flag = false;			//��������
						break;
					}
				}
			}else {
				flag = false;					//��0��ͷ,������qq��׼
			}
		}else {
			flag = false;						//���Ȳ�����
		}
		return flag;
	}
}
