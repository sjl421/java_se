package com.thinktik.demo28.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferDemo01 {
    public static void main(String[] args) {
        useNio();
    }

    private static void useNio() {
        RandomAccessFile accessFile = null;
        try {
            accessFile = new RandomAccessFile("src/com/thinktik/accessFile.txt", "rw");
            FileChannel inChannel = accessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(32);

            int bytesRead = inChannel.read(byteBuffer);

            while (bytesRead != -1) {
                byteBuffer.flip();

                while (byteBuffer.hasRemaining()) {
                    System.out.println((char) byteBuffer.get());
                }

                byteBuffer.clear();
                bytesRead = inChannel.read(byteBuffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                accessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
