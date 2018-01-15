package com.thinktik.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * FileOutputStream�ڴ��������ʱ�������û������ļ�����Ҵ�������
	 * ���������ļ��ͻ��Ƚ��ļ����
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);	//�������д���ڵڶ���������true
		fos.write(97);
		fos.write(98);
		
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");		//�����ֽ����������,���û�о��Զ�����һ��
		//fos.write(97);				//��Ȼд������һ��int��,���ǵ��ļ��ϵ���һ���ֽ�,���Զ�ȥ��ǰ����8λ
		//fos.write(98);
		//fos.write(99);
		fos.write(100);
		fos.close();
	}

}
