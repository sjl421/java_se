package com.thinktik.regex;

public class Demo2_Regex {

	/**
	 * [abc] a��b �� c�����ࣩ 
		[^abc] �κ��ַ������� a��b �� c���񶨣� 
		[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
		[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
		[a-z&&[def]] d��e �� f�������� 
		[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
		[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		String regex = "[a-z&&[^m-p]]";
		System.out.println("m".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("n".matches(regex));
	}

	private static void demo6() {
		String regex = "[a-z&&[^bc]]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("1".matches(regex));
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";						//ȡ����
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";
		System.out.println("a".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("n".matches(regex));
	}

	private static void demo3() {
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo2() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
		System.out.println("10".matches(regex));		//10����1�ַ���0�ַ�,���ǵ����ַ�
	}

	private static void demo1() {
		String regex = "[abc]";					//[]�������ַ�
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

}
