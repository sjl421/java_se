package com.thinktik.demo20.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yyy.txt");
        fw.write("댕소봤,샘뇟겯우쌈쐤棺 河?댕소狼클제,狼솽넣!!!");
        fw.write(97);
        fw.close();
    }

}
