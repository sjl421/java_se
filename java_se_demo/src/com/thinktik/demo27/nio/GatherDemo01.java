package com.thinktik.demo28.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GatherDemo01 {
    public static void main(String[] args) {
        useNioGather();
    }

    private static void useNioGather() {

        RandomAccessFile accessFile = null;
        try {
            ByteBuffer headerBuffer = ByteBuffer.allocate(128);
            ByteBuffer bodyBuffer = ByteBuffer.allocate(1024);
            headerBuffer.put((byte) 65);
            bodyBuffer.put((byte) 66);
            headerBuffer.flip();
            bodyBuffer.flip();
            ByteBuffer[] bufferArray = {headerBuffer, bodyBuffer};
            accessFile = new RandomAccessFile("src/com/thinktik/exportFile.txt", "rw");
            FileChannel outChannel = accessFile.getChannel();
            outChannel.write(bufferArray);
            outChannel.force(true);
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
