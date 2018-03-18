package com.thinktik.forfor;

/**
 * 汉语金额数字转换程序
 *
 * @author thinktik
 */
public class gotoSwitch {

	/**
	 * 数字转换为汉语金额数字
	 *
	 * @param num
	 *            数字
	 * @return 汉语金额数字
	 */
	public static String genCnNum(Long num) {
		StringBuffer sb = new StringBuffer();
		String snum = String.valueOf(num);
		for (char c : snum.toCharArray()) {
			sb.append(num2Cn(c));
		}
		return sb.toString();
	}

	/**
	 * 字符数字转换为汉语金额数字
	 *
	 * @param c
	 *            字符数字
	 * @return 汉语金额数字
	 */
	private static String num2Cn(char c) {
		String res = null;
		switch (c) {
		case '0':
			res = "零";
			break;
		case '1':
			res = "壹";
			break;
		case '2':
			res = "貮";
			break;
		case '3':
			res = "叁";
			break;
		case '4':
			res = "肆";
			break;
		case '5':
			res = "伍";
			break;
		case '6':
			res = "陆";
			break;
		case '7':
			res = "柒";
			break;
		case '8':
			res = "捌";
			break;
		case '9':
			res = "玖";
			break;
		default:
			System.out.println("您的输入有误，请重试！");
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(genCnNum(4523586022L));
	}
}