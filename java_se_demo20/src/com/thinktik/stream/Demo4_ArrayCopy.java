package com.thinktik.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

	/**
	 * @param args
	 * �����ֿ���
	 * ����С����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis = new FileInputStream("���ഺ.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {				//������Ǽ�arr,���صľͲ��Ƕ�ȡ���ֽڸ���,�����ֽڵ����ֵ
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1) {
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[2];
		int a = fis.read(arr);						//���ļ��ϵ��ֽڶ�ȡ���ֽ�������
		
		System.out.println(a);						//��������Ч�ֽڸ���
		for (byte b : arr) {						//��һ�λ�ȡ���ļ��ϵ�a��b
			System.out.println(b);
		}
		System.out.println("-----------------------");
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
		fis.close();
	}

}
