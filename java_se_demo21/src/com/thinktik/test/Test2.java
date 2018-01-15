package com.thinktik.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Test2 {

	/**
	 * @param args
	 * ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * 1,������������������������
	 * 2,����˫�м��϶���,Ŀ���ǰ��ַ�������,���ַ����ֵĴ�������ֵ
	 * 3,ͨ����ȡ�����򼯺��д洢,�洢��ʱ��Ҫ�ж�,���������������ͽ�����ֵΪ1�洢,��������ͽ�����ֵ��1�洢
	 * 4,�ر�������
	 * 5,�������������
	 * 6,�����д��
	 * 7,�ر������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1,������������������������
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		//2,����˫�м��϶���,Ŀ���ǰ��ַ�������,���ַ����ֵĴ�������ֵ
		HashMap<Character, Integer> hm = new HashMap<>();
		//3,ͨ����ȡ�����򼯺��д洢,�洢��ʱ��Ҫ�ж�,���������������ͽ�����ֵΪ1�洢,��������ͽ�����ֵ��1�洢
		int c;
		while((c = br.read()) != -1) {
			char ch = (char)c;
			/*if(!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}else {
				hm.put(ch, hm.get(ch) +  1);
			}*/
			
			hm.put(ch, !hm.containsKey(ch)? 1 : hm.get(ch) + 1);
		}
		//4,�ر�������
		br.close();
		//5,�������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		//6,�����д��
		
		for (Character key : hm.keySet()) {
			bw.write(key + "=" + hm.get(key));
		}
		
		bw.close();
	}

}
