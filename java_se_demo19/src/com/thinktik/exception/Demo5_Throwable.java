package com.thinktik.exception;

public class Demo5_Throwable {

	/**
	 * * A:Throwable�ļ�����������
			* a:getMessage()
				* ��ȡ�쳣��Ϣ�������ַ�����
			* b:toString()
				* ��ȡ�쳣�������쳣��Ϣ�������ַ�����
			* c:printStackTrace()
				* ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
		* B:������ʾ
			* Throwable�ļ������������Ļ���ʹ��
	 */
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {			//Exception e = new ArithmeticException("/ by zero");
			//System.out.println(e.getMessage());		//��ȡ�쳣��Ϣ
			//System.out.println(e); 		//����toString����,��ӡ�쳣�������쳣��Ϣ
			e.printStackTrace();		//jvmĬ�Ͼ������ַ�ʽ�����쳣
		}
	}

}
