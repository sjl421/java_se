package com.thinktik.otherclass;

public class Demo3_System {

	/**
	 * * A:System��ĸ���
			* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
		* B:��Ա����
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:������ʾ
			* System��ĳ�Ա����ʹ��
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		System.out.println("--------------------------");
		System.arraycopy(src, 0, dest, 0, src.length);		//���������ݿ���
		
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	public static void demo3() {
		long start = System.currentTimeMillis();		//1�����1000����
		for(int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();			//��ȡ��ǰʱ��ĺ���ֵ
		
		System.out.println(end - start);
	}

	public static void demo2() {
		System.exit(1);							//��0״̬���쳣��ֹ,�˳�jvm
		System.out.println("11111111111");
	}

	public static void demo1() {
		for(int i = 0; i < 100; i++) {
			new Demo();
			System.gc();						//��������������,�൱�ں������ఢ��
		}
	}

}

class Demo {									//��һ��Դ�ļ��в�������������public���ε���

	@Override
	public void finalize() {
		System.out.println("��������ɨ��");
	}							
	
}
