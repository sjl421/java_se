package com.thinktik;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ScatterDemo01 {
	public static void main(String[] args) {
		useNioScatter();

	}

	private static void useNioScatter() {
		RandomAccessFile accessFile = null;
		try {
			ByteBuffer headerBuffer = ByteBuffer.allocate(128);
			ByteBuffer bodyBuffer = ByteBuffer.allocate(1024);

			ByteBuffer[] byteBuffers = { headerBuffer, bodyBuffer };
			accessFile = new RandomAccessFile("src/com/thinktik/accessFile.txt", "rw");
			FileChannel inChannel = accessFile.getChannel();

			long bytesRead = inChannel.read(byteBuffers);

			while (bytesRead != -1) {

				headerBuffer.flip();
				while (headerBuffer.hasRemaining()) {
					System.out.println("headerBuffer :" + (char) headerBuffer.get());
				}

				bodyBuffer.flip();
				while (bodyBuffer.hasRemaining()) {
					System.out.println("bodyBuffer :" + (char) bodyBuffer.get());
				}
				headerBuffer.clear();
				bodyBuffer.clear();
				bytesRead = inChannel.read(byteBuffers);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				accessFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
