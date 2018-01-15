package com.thinktik.collection;

import com.thinktik.bean.Student;

public class Demo1_Array {

	/**
	 * * A:������ʾ
			* ��������5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
		* 
				Student[] arr = new Student[5];					//�洢ѧ������
				arr[0] = new Student("����", 23);
				arr[1] = new Student("����", 24);
				arr[2] = new Student("����", 25);
				arr[3] = new Student("����", 26);
				arr[4] = new Student("���", 20);
				
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
		* B:��ͼ��ʾ
			* ��ѧ������İ�����ͼ����
			* ����ͼ��ϴ洢������������,��Ķ��ǵ�ֵַ
	 */
	public static void main(String[] args) {
		//int[] arr = new int[5];					//��������������������
		Student[] arr = new Student[5];				//��������������������
		arr[0] = new Student("����", 23);				//����һ��ѧ������,�洢������ĵ�һ��λ��
		arr[1] = new Student("����", 24);				//����һ��ѧ������,�洢������ĵڶ���λ��
		arr[2] = new Student("����", 25);				//����һ��ѧ������,�洢������ĵ�����λ��
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
