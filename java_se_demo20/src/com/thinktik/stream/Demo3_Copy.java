package com.thinktik.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		//�ڶ��ֿ���,���Ƽ�ʹ��,��Ϊ�п��ܻᵼ���ڴ����
		FileInputStream fis = new FileInputStream("���ഺ.mp3");		//��������������,�������ഺ.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");	//�������������,����copy.mp3
		//int len = fis.available();
		//System.out.println(len);
		
		byte[] arr = new byte[fis.available()];						//�������ļ�һ����С���ֽ�����
		fis.read(arr);												//���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fos.write(arr);												//���ֽ������е��ֽ�����д���ļ���
		
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("���ഺ.mp3");		//��������������,�������ഺ.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");	//�������������,����copy.mp3
		
		int b;
		while((b = fis.read()) != -1) {								//�ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b);											//��ÿһ���ֽ�д��
		}
		
		fis.close();												//�����ͷ���Դ
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("˫Ԫ.jpg");		//��������������,����˫Ԫ.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//�������������,����copy.jpg
		
		int b;
		while((b = fis.read()) != -1) {								//�ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b);											//��ÿһ���ֽ�д��
		}
		
		fis.close();												//�����ͷ���Դ
		fos.close();
	}

}
