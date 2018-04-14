package com.thinktik.demo26.enumerate;

public class EnumDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
		demo2();
//		demo3();
//		demo4();
	}

	private static void demo4() {
		EnumWeek03 mon = EnumWeek03.TUE;
		switch (mon) {
		case MON:
			System.out.println("星期一");
			break;
		case TUE:
			System.out.println("星期二");
			break;
		}
	}

	public static void demo3() {
		EnumWeek03 mon = EnumWeek03.MON;
		mon.show();
	}

	public static void demo2() {
		EnumWeek02 mon = EnumWeek02.MON;
		System.out.println(mon.getName());
	}

	public static void demo1() {
		EnumWeek01 mon = EnumWeek01.MON;
		System.out.println(mon);
	}

}
