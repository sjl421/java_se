package com.thinktik.demo20.chario;

import java.io.*;

public class Demo7_TransIO {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //demo1();
        //demo2();
        BufferedReader br =                                //更高效的读
                new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
        BufferedWriter bw =                                //更高效的写
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
        int c;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }

        br.close();
        bw.close();
    }

    public static void demo2() throws UnsupportedEncodingException,
            FileNotFoundException, IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "uTf-8");    //指定码表读字符
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");    //指定码表写字符

        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        isr.close();
        osw.close();
    }

    public static void demo1() throws FileNotFoundException, IOException {
        //用默认编码表读写,出现乱码
        FileReader fr = new FileReader("utf-8.txt");
        FileWriter fw = new FileWriter("gbk.txt");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }

}
