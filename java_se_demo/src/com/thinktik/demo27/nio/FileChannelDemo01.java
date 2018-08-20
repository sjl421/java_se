package com.thinktik.demo28.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo01 {
    public static void main(String[] args) {
        useNioFileChannel();
    }

    private static void useNioFileChannel() {
        RandomAccessFile accessFile = null;

        try {
            accessFile = new RandomAccessFile("src/com/thinktik/exportFile.txt", "rw");
            FileChannel outChannel = accessFile.getChannel();
            System.out.println(outChannel.size());
            ByteBuffer buf = ByteBuffer.allocate(1024);


            String newData = "New String to write to file..." + System.currentTimeMillis();
            buf.clear();
            buf.put(newData.getBytes());
            buf.flip();
            while (buf.hasRemaining()) {
                outChannel.write(buf);
            }

            outChannel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
