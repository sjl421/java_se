package com.thinktik.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 * close����
	 * �߱�ˢ�µĹ���,�ڹر���֮ǰ,�ͻ���ˢ��һ�λ�����,�����������ֽ�ȫ��ˢ�µ��ļ���,�ٹر�,close����ˢ��֮�����д��
	 * flush����?
	 * �߱�ˢ�µĹ���,ˢ��֮�󻹿��Լ���д
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//flush��close����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("���ഺ.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("���ഺ.mp3");				//��������������,�������ഺ.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");			//�������������,����copy.mp3
		BufferedInputStream bis = new BufferedInputStream(fis);				//��������������,�����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
