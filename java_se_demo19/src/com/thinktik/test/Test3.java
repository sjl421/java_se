package com.thinktik.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {

	/**
	 * @param args
	 * * A:������ʾ
	 * �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 */
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
//		String[] arr = dir.list();					//��ȡe�������е��ļ����ļ���
//		for (String string : arr) {
//			if(string.endsWith(".jpg")) {
//				System.out.println(string);
//			}
//		}
		
		/*File[] subFiles = dir.listFiles();			//��ȡe�������е��ļ����ļ��ж���
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".jpg")) {
				System.out.println(subFile);
			}
		}*/
		
		String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir);
				//System.out.println(name);
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
