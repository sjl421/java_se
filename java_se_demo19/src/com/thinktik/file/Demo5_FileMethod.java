package com.thinktik.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

	/**
	 * * A:��ȡ����
		* public String getAbsolutePath()����ȡ����·��
		* public String getPath():��ȡ·��
		* public String getName():��ȡ����
		* public long length():��ȡ���ȡ��ֽ���
		* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
		* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
		* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
	 */
	public static void main(String[] args) {
		//demo1();
		File dir = new File("F:/˫Ԫ����/day19/video");
		String[] arr = dir.list();						//��Ϊ�˻�ȡ�ļ���
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();
		
		for (File file : subFiles) {					//��ȡ�ļ�����
			System.out.println(file);
		}
 	}

	public static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("D:\\˫Ԫ����\\day19\\ccc.txt");
		//System.out.println(file1.getAbsolutePath());			//��ȡ����·��
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file1.getPath());					//��ȡ���췽���д���·��
		//System.out.println(file2.getPath());
		
//		System.out.println(file1.getName());					//��ȡ�ļ������ļ�������
//		System.out.println(file2.getName());
//		
//		System.out.println(file1.length());
		
		Date d = new Date(file1.lastModified());				//�ļ�������޸�ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
	}

}
