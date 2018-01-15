package com.thinktik.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_Buffered {

	/**
	 * @param args
	 * �������������е����ⷽ��
	 * readLine()
	 * newLine();
	 * 
	 * newLine()��\r\n������
	 * newLine()�ǿ�ƽ̨�ķ���
	 * \r\nֻ֧�ֵ���windowsϵͳ
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//bw.newLine();							//д���س����з�
			//bw.write("\r\n");
		}
		
		br.close();
		bw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}
