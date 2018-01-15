package com.thinktik.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	/**
	 * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�
	 * 
	 * ����:
	 * 1,��������¼�����
	 * 2,�������������,����text.txt�ļ�
	 * 3,��������ѭ��
	 * 4,����quit�˳�ѭ��
	 * 5,�����quit,�ͽ�����д��
	 * 6,�ر���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,��������¼�����
		Scanner sc = new Scanner(System.in);
		//2,�������������,����text.txt�ļ�
		FileOutputStream fos = new FileOutputStream("text.txt");
		System.out.println("����������:");
		//3,��������ѭ��
		while(true) {
			String line = sc.nextLine();					//������¼������ݴ洢��line��
			//4,����quit�˳�ѭ��
			if("quit".equals(line)) {
				break;
			}
			//5,�����quit,�ͽ�����д��
			fos.write(line.getBytes());						//�ַ���д������ת�����ֽ�����
			fos.write("\r\n".getBytes());
		}
		//6,�ر���
		fos.close();
	}

}
