package com.thinktik.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.thinktik.bean.Person;

public class Demo3_TreeSet {

	/**
	 * @param args
	 * TreeSet��������������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
	 * ��compareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
	 * ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
	 * ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//����:���ַ������ճ�������
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());		//Comparator c = new CompareByLen();
		ts.add("aaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		
		System.out.println(ts);
	}

	public static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 13));
		ts.add(new Person("wangwu", 33));
		ts.add(new Person("zhaoliu", 43));
		ts.add(new Person("aaaa", 53));
		
		System.out.println(ts);
	}

	public static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����", 13));
		ts.add(new Person("����", 23));
		ts.add(new Person("����", 43));
		ts.add(new Person("����", 33));
		
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		System.out.println('��' + 0);
		
		System.out.println(ts);
	}

	public static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����", 23));
		ts.add(new Person("����", 13));
		ts.add(new Person("����", 13));
		ts.add(new Person("����", 43));
		ts.add(new Person("����", 33));
		
		System.out.println(ts);
	}

	public static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(3);
		ts.add(3);
		
		System.out.println(ts);
	}

}


class CompareByLen /*extends Object*/ implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {		//�����ַ����ĳ��ȱȽ�
		int num = s1.length() - s2.length();		//����Ϊ��Ҫ����
		return num == 0 ? s1.compareTo(s2) : num;	//����Ϊ��Ҫ����
	}
	
}