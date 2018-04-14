package com.thinktik.demo26.enumerate;

public class Week02 {
	
	public static final Week02 MON = new Week02("星期一");
	public static final Week02 TUE = new Week02("星期二");
	public static final Week02 WED = new Week02("星期三");
	
	private String name;
	private Week02(String name){
		this.name = name;
	}						//私有构造,不让其他类创建本类对象
	public String getName() {
		return name;
	}
	
	
}
