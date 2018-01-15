package com.thinktik.exception;

public class Demo2_Exception {

	/**
	 * * A:�쳣��������ַ�ʽ
			* a:try��catch��finally
				* try catch
				* try catch finally
				* try finally 
			* b:throws
		* B:try...catch�����쳣�Ļ�����ʽ
			* try��catch��finally
		* C:������ʾ
			* try...catch�ķ�ʽ����1���쳣
		
		try:��������쳣��
		catch:���������쳣��
		finally:�ͷ���Դ
		
		�������������������������try����catch,�����㷢����Ƣ��,�Ҷ���������,ĬĬ����
		��ͨ��trycatch�����⴦����,��������ִ��
	 */
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(ArithmeticException a) {		//ArithmeticException a = new ArithmeticException();
			System.out.println("������,����Ϊ����");
		}
		
		System.out.println("1111111111111111");
	}

}

class Demo2 {
	/*
	 * ��������
	 */
	public int div(int a,int b) {		//a = 10,b = 0
		return a / b;					// 10 / 0  ��������10,������0��������0��ʱ��Υ�����������㷨��,�׳��쳣
										//new ArithmeticException("/ by zero");
	}
} 
