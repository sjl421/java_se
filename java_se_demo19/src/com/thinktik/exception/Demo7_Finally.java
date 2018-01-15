package com.thinktik.exception;

public class Demo7_Finally {

	/**
	 * * A:finally���ص�
			* ��finally���Ƶ������һ����ִ��
			* �����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
		* B:finally������
			* �����ͷ���Դ����IO�����������ݿ�����л����
		* C:������ʾ
			* finally�ؼ��ֵ��ص㼰����
		*return����൱���Ƿ��������һ����,��ô��������֮ǰ�ῴһ����û��finally���������Ը,����оͽ�finallyִ��
		*���ڳ��׷���
	 */
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("����Ϊ����");
			System.exit(0);								//�˳�jvm�����
			return;
		} finally {
			System.out.println("������ִ������");
		}
	}

}
