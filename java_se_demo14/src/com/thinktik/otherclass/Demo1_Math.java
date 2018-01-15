package com.thinktik.otherclass;

public class Demo1_Math {

	/**
	 * @param args
	 * * A:Math�����
		* Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
	* B:��Ա����
		* public static int abs(int a)
		* public static double ceil(double a)
		* public static double floor(double a)
		* public static int max(int a,int b) min��ѧ
		* public static double pow(double a,double b)
		* public static double random()
		* public static int round(float a) ����Ϊdouble����ѧ
		* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));  			//ȡ����ֵ
		
		//ceil�컨��
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		 */
		System.out.println(Math.ceil(12.3));			//����ȡ��,���ǽ����һ��double
		System.out.println(Math.ceil(12.99));
		
		System.out.println("-----------");
		//floor�ذ�
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		 */
		System.out.println(Math.floor(12.3));			//����ȡ��,���ǽ����һ��double
		System.out.println(Math.floor(12.99));
		
		//��ȡ����ֵ�е����ֵ
		System.out.println(Math.max(20, 30));
		
		//ǰ������ǵ���,���������ָ��
		System.out.println(Math.pow(2, 3));				//2.0 ^ 3.0
		
		//����0.0��1.0֮�������С��,����0.0,������1.0
		System.out.println(Math.random());
		
		//��������
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.9f));
		
		//��ƽ��
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
	}

}
