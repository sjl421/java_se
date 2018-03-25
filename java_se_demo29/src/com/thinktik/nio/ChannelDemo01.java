package com.thinktik.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo01 {
	public static void main(String[] args) {
		useNio();
	}

	private static void useNio() {
		RandomAccessFile accessFile = null;

		try {
			accessFile = new RandomAccessFile("src/com/thinktik/accessFile.txt", "rw");

			FileChannel inChannel = accessFile.getChannel();

			ByteBuffer byteBuffer = ByteBuffer.allocate(32);
			int byteReader = inChannel.read(byteBuffer);

			while (byteReader != -1) {
				System.out.println("Read :" + byteReader);
				byteBuffer.flip();

				while (byteBuffer.hasRemaining()) {
					System.out.println(byteBuffer.get());
				}

				byteBuffer.clear();

				byteReader = inChannel.read(byteBuffer);
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
