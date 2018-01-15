package com.thinktik.generic;

import com.thinktik.bean.Student;
import com.thinktik.bean.Tool;
import com.thinktik.bean.Worker;

public class Demo3_Generic {

	/**
	 * A:������ʾ
	 * ���͵�����:ͨ��Objectת����������
	 * ���ڵ�Object���Ϳ��Խ�������Ķ������ͣ�������ʵ�ʵ�ʹ���У���������ת�������⡣Ҳ�ʹ���������������Java�ṩ�˷�������������ȫ���⡣
	 */
	public static void main(String[] args) {
		//demo1();
		Tool<String> t = new Tool<>();
		//t.show("abc");
		t.show(true);
	}

	public static void demo1() {
		Tool<Student> t = new Tool<>();					//�������������
		t.setObj(new Student("����",23));
		
		//Worker w = (Worker) t.getObj();			//����ת��
		//System.out.println(w);
	}

}
