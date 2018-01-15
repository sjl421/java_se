package com.thinktik.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/**
	 * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 * 
	 * 1,����Scanner����,����¼��
	 * 2,����TreeSet���϶���,TreeSet�����д���Ƚ���
	 * 3,����ѭ�����Ͻ�������,����quit�˳�,��Ϊ�˳���quit,���Լ���¼���ʱ��Ӧ�ö����ַ�������ʽ¼��
	 * 4,�ж���quit���˳�,���ǽ���ת��ΪInteger,����ӵ�������
	 * 5,����TreeSet���ϲ���ӡÿһ��Ԫ��
	 */
	public static void main(String[] args) {
		//1,����Scanner����,����¼��
		Scanner sc = new Scanner(System.in);
		//2,����TreeSet���϶���,TreeSet�����д���Ƚ���
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				//int num = i2 - i1;					//�Զ�����
				int num = i2.compareTo(i1);
				return num == 0 ? 1 : num;
			}
		});
		//3,����ѭ�����Ͻ�������,����quit�˳�,��Ϊ�˳���quit,���Լ���¼���ʱ��Ӧ�ö����ַ�������ʽ¼��
		while(true) {
			String line = sc.nextLine();				//������¼����ַ����洢��line��
			if("quit".equals(line)) {
				break;
			}
			//4,�ж���quit���˳�,���ǽ���ת��ΪInteger,����ӵ�������
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}
		
		// 5,����TreeSet���ϲ���ӡÿһ��Ԫ��
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
