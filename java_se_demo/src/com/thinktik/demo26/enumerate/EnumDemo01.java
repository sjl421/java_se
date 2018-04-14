package com.thinktik.demo26.enumerate;

public class EnumDemo01{

	public static void main(String[] args) {
		//demo1();
		//demo2();
		demo3();
	}

	private static void demo3() {
		Week03 mon = Week03.MON;
		mon.show();
	}

	public static void demo2() {
		Week02 mon = Week02.MON;
		System.out.println(mon.getName());
	}

	public static void demo1() {
		Week01 mon = Week01.MON;
		Week01 tue = Week01.TUE;
		Week01 wed = Week01.WED;
		
		System.out.println(mon);
		System.out.println(tue);
		System.out.println(wed);
	}

}
