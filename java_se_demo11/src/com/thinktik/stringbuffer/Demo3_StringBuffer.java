package com.thinktik.stringbuffer;

public class Demo3_StringBuffer {

	/**
	 * * A:StringBuffer��ɾ������
		* public StringBuffer deleteCharAt(int index):
			* ɾ��ָ��λ�õ��ַ��������ر���
		* public StringBuffer delete(int start,int end):
			* ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//sb.deleteCharAt(5);					//�������������������û��Ԫ�ص�ʱ��ͻᱨStringIndexOutOfBoundsException
		sb.append("heima");
		//sb.deleteCharAt(4);					//��������ɾ��������λ���϶�Ӧ���ַ�
		//sb.delete(0, 2);						//ɾ����ʱ���ǰ���ͷ,������β
		//System.out.println(sb);
		//sb.delete(0, sb.length());				//��ջ�����
		//System.out.println(sb);
		
		sb = new StringBuffer();				//��Ҫ�����ַ�ʽ��ջ�����,ԭ���Ļ�������,�˷��ڴ�
		System.out.println(sb);
	}

}
