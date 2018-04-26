package com.thinktik.demo27;

import org.junit.Test;

import java.nio.ByteBuffer;

/*
 * 缓冲区:在java NIO中负责存储数据的，缓冲区的本质是:数组，用来存储不同数据类型的数据
 * 根据数据类型不同，提供相应类型的缓冲区
 * ByteBuffer,CharacterBuffer,ShortBuffer,IntrBuffer,LongBuffer,FloatBuffer,DoubleBuffer
 * (1)通过allocate()获取缓冲区，最常用ByteBuffer
 * 缓冲区中存取数据的方法，
 * put():存入数据到缓冲区中
 * get():获取缓冲区中的数据
 *  mark:
 *  position:缓冲区中正在操作的位置
 *  limit:界限:表示缓冲区中可以操作数据的大小(limit后面的数据不能读写)
 *  capacity:容量:表示缓冲区中最大存储数据的容量，一旦声明不能改变
 */
public class NIODemo03 {
    @Test
    public void testBuffer() {
        // 1:分配一个指定大小的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        System.out.println("----------------------");
        // 2:利用put()方法存入数据到缓冲区中(写数据模式)
        String str = "abcdef";
        buffer.put(str.getBytes());
        // 3:获取缓冲区中的数据(读数据模式)
        buffer.flip();// 切换到读数据
        byte[] dst = new byte[buffer.limit()];
        buffer.get(dst, 0, str.length());
        System.out.println("字节:" + dst);
        String s = new String(dst);
        System.out.println("字符:" + s);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        System.out.println("----------------------");
        buffer.rewind();// 随机读写
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        buffer.clear();// 清除缓冲区
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        byte[] dst1 = new byte[buffer.limit()];
        buffer.get(dst, 0, str.length());
        System.out.println("字节:" + dst1);
        System.out.println("字符:" + new String(dst1));
    }
}