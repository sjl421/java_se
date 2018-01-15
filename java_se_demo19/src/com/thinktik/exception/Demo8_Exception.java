package com.thinktik.exception;

public class Demo8_Exception {

	/**
	 * * A:Ϊʲô��Ҫ�Զ����쳣
	 		* ͨ���������ֵ����������쳣,����ԵĽ���취 
			* �������˵�����
		* B:�Զ����쳣����
			* �̳���Exception
			* �̳���RuntimeException
		* C:������ʾ
			* �Զ����쳣�Ļ���ʹ��
	 */
	public static void main(String[] args) {

	}

}

class AgeOutOfBoundsException extends Exception {

	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}
