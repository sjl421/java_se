package com.thinktik.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	/**
	 * @param args
	 * @throws IOException  
	 * read()������ȡ����һ���ֽ�,Ϊʲô������int,������byte
	 * 
	 * 00010100 00100100 01000001 11111111 0000000
	 * 
	 * 10000001    byte����-1��ԭ��
	 * 11111110	   -1�ķ���
	 * 11111111    -1�Ĳ���
	 * 
	 * 00000000 00000000 00000000 11111111
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");	//����������
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");	//����������
		int x = fis.read();										//��Ӳ���϶�ȡһ���ֽ�
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int z = fis.read();
		System.out.println(z);
		int a = fis.read();
		System.out.println(a);
		int b = fis.read();
		System.out.println(b);
		fis.close();											//�����ͷ���Դ
	}

}
