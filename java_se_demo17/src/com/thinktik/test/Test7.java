package com.thinktik.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.thinktik.bean.Student;

public class Test7 {

	/**
	 * * A:������ʾ
	 * ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
	 * 
	 * ����:
	 * 1,����һ��ѧ����
	 * 		��Ա����:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܳɼ�
	 * 		��Ա����:�ղ�,�вι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	 * 			  toString����,�ڱ��������е�Student�����ӡ�������õ�ʱ�����ʾ����ֵ
	 * 2,����¼����ҪScanner,��������¼�����
	 * 3,����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,�����ֱܷȽ�
	 * 4,¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ͽ��д洢
	 * 5,��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӶ���Ԫ��ת����int��,
	 * 6,��ת����Ľ����װ��Student����,��Student��ӵ�TreeSet������
	 * 7,����TreeSet���ϴ�ӡÿһ��Student����
	 */
	public static void main(String[] args) {
		//2,����¼����ҪScanner,��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���ʽ��:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
		//3,����TreeSet���϶���,��TreeSet�Ĺ��캯���д���Ƚ���,�����ֱܷȽ�
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				return num == 0 ? 1 : num;
			}
		});
		//4,¼�����ѧ��,�����Լ����е�ѧ������Ϊ�ж�����,���size��С��5�ͽ��д洢
		while(ts.size() < 5) {
			//5,��¼����ַ����и�,�ö����и�,�᷵��һ���ַ�������,���ַ��������дӶ���Ԫ��ת����int��,
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			//6,��ת����Ľ����װ��Student����,��Student��ӵ�TreeSet������
			ts.add(new Student(arr[0], chinese, math, english));
		}
		
		//7,����TreeSet���ϴ�ӡÿһ��Student����
		System.out.println("������ѧ����Ϣ:");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
