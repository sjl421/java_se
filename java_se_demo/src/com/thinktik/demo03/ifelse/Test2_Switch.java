package com.thinktik.demo03.ifelse;

/**
 * @author think
 * 2018年1月16日下午11:31:00
 * case  default
 */
class Test2_Switch {
    public static void main(String[] args) {
        // A:看程序写结果：

        int x = 2;
        int y = 3;
        switch (x) {
            default://注意default的位置
                y--;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y=" + y);//4

        //B:看程序写结果：
/*		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);//6
*/
    }
}
