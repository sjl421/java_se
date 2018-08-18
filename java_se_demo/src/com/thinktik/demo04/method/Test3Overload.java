package com.thinktik.demo04.method;

/*
 * A:案例演示
 * 需求：比较两个数据是否相等。
 * 参数类型分别为两个int类型，两个double类型，并在main方法中进行测试
 
 */
public class Test3Overload {
    private static double a;
    private static double b;
    
    public static void main(String[] args) {
        boolean b1 = isEquals(10, 10);
        System.out.println(b1);
        
        boolean b2 = isEquals(10.5, 10.5);
        System.out.println(b2);
    }
    
    /*
    比较两个数据是否相等
    1,返回值类型boolean
    2,参数列表int a,int b
    */
    public static boolean isEquals(int a, int b) {
        if (a == b)
            return true;
        else
            return false;
    }

	/*
	比较两个数据是否相等
	1,返回值类型boolean
	2,参数列表double a,double b
	*/
    
    public static boolean isEquals(double a, double b) {
        Test3Overload.a = a;
        Test3Overload.b = b;
        return a == b;
    }
}
