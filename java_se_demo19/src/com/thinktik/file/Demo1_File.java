package com.thinktik.file;

import java.io.File;


public class Demo1_File {

	/**
	 * File(String pathname)������һ��·���õ�File����
	 * File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	 * File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		File parent = new File("F:\\˫Ԫ����\\day19\\video");
		String child = "001_��������.avi";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void demo2() {
		String parent = "F:\\˫Ԫ����\\day19\\video";
		String child = "001_��������.avi";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	public static void demo1() {
		File file = new File("F:\\˫Ԫ����\\day19\\video\\001_��������.avi");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
		
		File file3 = new File("yyy.txt");
		System.out.println(file3.exists());
	}

}
