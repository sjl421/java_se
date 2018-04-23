package com.thinktik.demo28.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ScoketChannelDemo01 {
    public static void main(String[] args) {
//		useNioSocketChannel();
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
    }

    public static void useNioSocketChannel() {
        SocketChannel socketChannel;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("http://47.52.115.129/", 80));

            ByteBuffer byteBuffer = ByteBuffer.allocate(32);
            int bytesRead = socketChannel.read(byteBuffer);
            while (bytesRead != -1) {
                byteBuffer.flip();

                while (byteBuffer.hasRemaining()) {
                    System.out.println((char) byteBuffer.get());
                }

                byteBuffer.clear();
                bytesRead = socketChannel.read(byteBuffer);
            }
            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
