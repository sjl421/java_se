package com.thinktik.array;

public class Demo2_Array {

	/**
	 * * A:������ʾ
			* ����߼����ֲ��Ҵ���
		* B:ע������
			* ����������򣬾Ͳ���ʹ�ö��ֲ��ҡ�
				* ��Ϊ����������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������

	 */
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 66));
		System.out.println(getIndex(arr, 88));
	}
	
	/*
	 * ���ֲ���
	 * 1,����ֵ����,int
	 * 2,�����б�int[] arr,int value
	 */
	
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {					//���м�ֵ������Ҫ�ҵ�ֵ,�Ϳ�ʼѭ������
			if(arr[mid] < value) {					//���м�ֵС����Ҫ�ҵ�ֵ
				min = mid + 1;						//��С�������ı�
			}else if (arr[mid] > value){			//���м�ֵ������Ҫ�ҵ�ֵ
				max = mid - 1;						//���������ı�
			}
			
			mid = (min + max) / 2;					//�����������С�ı�,�м�����������֮�ı�
			
			if(min > max) {							//�����С�����������������,��û�в��ҵĿ�������
				return -1;							//����-1
			}
		}
		return mid;
	}
}
