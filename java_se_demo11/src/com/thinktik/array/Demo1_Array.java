package com.thinktik.array;

public class Demo1_Array {

	/**
	 * * A:������ʾ
	* ����߼�ð���������
	 */
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		bubbleSort(arr);
		//selectSort(arr);
		print(arr);
	}
	
	/*
	 * ð������
	 * 1,����ֵ����,void
	 * 2,�����б�,int[] arr
	 * 
	 * 	��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
		�ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
		������:arr[0]��arr[1],arr[1]��arr[2]�Ƚ�2��
		���Ĵ�:arr[0]��arr[1]�Ƚ�1��
	 */
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {				//��ѭ��ֻ��Ҫ�Ƚ�arr.length-1�ξͿ�����
			for (int j = 0; j < arr.length - 1 - i; j++) {		//-1Ϊ�˷�ֹ����Խ��,-iΪ�����Ч��
				if(arr[j] > arr[j+1]) {
					/*int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;*/
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	/*
	 * ��ӡ����
	 * 1,����ֵ����void
	 * 2,�����б�int[]arr
	 */
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	 * ѡ������
	 * 1,����ֵ����void
	 * 2,�����б�int[] arr
	 * 
	 * 	��һ��:arr[0]�ֱ���arr[1-4]�Ƚ�,�Ƚ�4��
		�ڶ���:arr[1]�ֱ���arr[2-4]�Ƚ�,�Ƚ�3��
		������:arr[2]�ֱ���arr[3-4]�Ƚ�,�Ƚ�2��
		���Ĵ�:arr[3]��arr[4]�Ƚ�,�Ƚ�1��
	 */
	
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {				//ֻ��Ҫ�Ƚ�arr.length-1��
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					/*int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;*/
					swap(arr,i,j);
				}
			}
		}
	}
	
	/*
	 * ��λ����
	 * 1,����ֵ����,void
	 * 2,�����б�int[] arr.int i,int j
	 * 
	 * ���ĳ������,ֻ��Ա���ʹ��,������������ʹ�þͿ��Զ����˽�е�
	 */
	
	private static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
