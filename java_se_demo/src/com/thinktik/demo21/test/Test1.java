package com.thinktik.demo21.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {

    /**
     * @param args ����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
     *             <p>
     *             ����:
     *             1,reda(byte[] b)���ֽ��������ķ���,����FileInputStream,����a.txt
     *             2,�����ڴ������,������������д���ڴ��������
     *             3,�����ֽ�����,����Ϊ5
     *             4,���ڴ������������ȫ��ת��Ϊ�ַ�����ӡ
     *             5,�ر�������
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //1,reda(byte[] b)���ֽ��������ķ���,����FileInputStream,����a.txt
        FileInputStream fis = new FileInputStream("a.txt");
        //2,�����ڴ������,������������д���ڴ��������
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //3,�����ֽ�����,����Ϊ5
        byte[] arr = new byte[5];
        int len;

        while ((len = fis.read(arr)) != -1) {
            baos.write(arr, 0, len);
            //System.out.println(new String(arr,0,len));
        }
        //4,���ڴ������������ȫ��ת��Ϊ�ַ�����ӡ
        System.out.println(baos);                    //��ʹû�е���,�ײ�Ҳ��Ĭ�ϰ����ǵ���toString()����
        //5,�ر�������
        fis.close();
    }
}
