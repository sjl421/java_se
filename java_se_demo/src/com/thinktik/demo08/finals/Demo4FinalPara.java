package com.thinktik.demo08.finals;

public class Demo4FinalPara {
	public static void main(String[] args) {
		changeValue(1);
		changeValue(new StringBuffer(""));
	}
	
	public static void changeValue(final int i) {
//		i++;  // 报错
	}
	
	public static void changeValue(final StringBuffer sb) {
		sb.append("A");  // 不报错
	}
}
