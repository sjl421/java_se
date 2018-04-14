package com.thinktik.demo26.enumerate;

public class EnumDemo03 {

	/**
	 * int ordinal()
	* int compareTo(E o)
	* String name()
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
	 */
	public static void main(String[] args) {
		//demo1();
		demo2();
	}

	private static void demo2() {
		EnumWeek02 mon = EnumWeek02.valueOf(EnumWeek02.class, "MON");		//通过字节码对象获取枚举项
		System.out.println(mon);
		
		EnumWeek02[] arr = EnumWeek02.values();
		for (EnumWeek02 week2 : arr) {
			System.out.println(week2);
		}
	}

	public static void demo1() {
		EnumWeek02 mon = EnumWeek02.MON;
		EnumWeek02 tue = EnumWeek02.TUE;
		EnumWeek02 wed = EnumWeek02.WED;
		
		System.out.println(mon.ordinal());				//枚举项都是有编号的
		System.out.println(tue.ordinal());
		System.out.println(wed.ordinal());
		
		System.out.println(mon.compareTo(tue));			//比较的是编号
		System.out.println(mon.compareTo(wed));
		
		System.out.println(mon.name()); 				//获取实例名称
		System.out.println(mon.toString()); 			//调用重写之后的toString方法
	}

}
