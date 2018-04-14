package com.thinktik.demo26.enumerate;

public enum EnumWeek02 {
	MON("星期一"),TUE("星期二"),WED("星期三");
	
	private String name;
	private EnumWeek02(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
