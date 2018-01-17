package com.thinktik.array;

import java.util.Arrays;

public class Demo3_Arrays {

	/**
	 	* public static String toString(int[] a)
		* public static void sort(int[] a)
		* public static int binarySearch(int[] a,int key)
		* 
		*  public static String toString(int[] a) {
		        if (a == null)								//��������������null
		            return "null";							//����null
		        int iMax = a.length - 1;					//iMax�������
		        if (iMax == -1)								//���������û��Ԫ��
		            return "[]";							//����[]
		
		        StringBuilder b = new StringBuilder();		//�̲߳���ȫ,Ч�ʸ�
		        b.append('[');								//��[��ӵ��ַ�����������
		        for (int i = 0; ; i++) {					//��������,�ж����û��дĬ����true
		            b.append(a[i]);							//�ѵ�һ��Ԫ����ӽ��ַ���������
		            if (i == iMax)							//��������������������ֵ
		                return b.append(']').toString();	//��]��ӵ��ַ���������,��ת�����ַ���������
		            b.append(", ");							//�����������������ͽ�, ��ӵ�������
		        }
    		}
    		
    	 private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
		        int low = fromIndex;				//��С����0
		        int high = toIndex - 1;				//����������鳤��-1
		
		        while (low <= high) {				//��С����С�ڵ��������������ѭ���ж�
		            int mid = (low + high) >>> 1;	//����м�����ֵ,(��С+���)/2
		            int midVal = a[mid];			//ͨ���м�������ȡ�м�ֵ
		
		            if (midVal < key)				//�м�������Ӧ��ֵС�ڲ��ҵ�ֵ
		                low = mid + 1;				//��С�����仯
		            else if (midVal > key)			//�м�������Ӧ��ֵ���ڲ��ҵ�ֵ
		                high = mid - 1;				//��������仯
		            else
		                return mid; // key found	//�ҵ���
		        }
		        return -(low + 1);  // key not found.//-����� - 1
		    }
	 */
	public static void main(String[] args) {
		int[] arr = {33,22,11,44,66,55};
		System.out.println(Arrays.toString(arr));			//����ת�ַ���
		
		Arrays.sort(arr);									//����
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {11,22,33,44,55,66};
		System.out.println(Arrays.binarySearch(arr2, 22));
		System.out.println(Arrays.binarySearch(arr2, 66));
		System.out.println(Arrays.binarySearch(arr2, 9));	//-�����-1
	}

}
