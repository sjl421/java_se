package com.thinktik.regex;

public class Demo4_Regex {

	/**
	 * Greedy ������ 
		X? X��һ�λ�һ��Ҳû�� 
		X* X����λ��� 
		X+ X��һ�λ��� 
		X{n} X��ǡ�� n �� 
		X{n,} X������ n �� 
		X{n,m} X������ n �Σ����ǲ����� m �� 
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String regex = "[abc]{5,15}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaabaabcbaaba".matches(regex));
	}

	public static void demo5() {
		String regex = "[abc]{5,}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaaba".matches(regex));
	}

	public static void demo4() {
		String regex = "[abc]{5}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcbaabcabbabab".matches(regex));
		System.out.println("abcb".matches(regex));
		System.out.println("abcbaaba".matches(regex));
	}

	public static void demo3() {
		String regex = "[abc]+";
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("aaaaabbbbccccc".matches(regex));
	}

	public static void demo2() {
		String regex = "[abc]*";
		System.out.println("".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("a".matches(regex));
	}

	public static void demo1() {
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("".matches(regex));
	}

}
