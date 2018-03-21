package com.thinktik;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

public class SelectorDemo01 {
	public static void main(String[] args) {
		useNioSelector();
	}

	public static void useNioSelector() {
//		Selector selector = Selector.open();
//
//		channel.configureBlocking(false);
//		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
//		while (true) {
//			int readyChannels = selector.select();
//			if (readyChannels == 0) {
//				continue;
//			}
//			Set<SelectionKey> selectedKeys = selector.selectedKeys();
//			Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
//			while (keyIterator.hasNext()) {
//				key = keyIterator.next();
//				if (key.isAcceptable()) {
//					// 一个连接被ServerSocketChannel接受
//				} else if (key.isConnectable()) {
//					// 与远程服务器建立了连接
//				} else if (key.isReadable()) {
//					// 一个channel做好了读准备
//				} else if (key.isWritable()) {
//					// 一个channel做好了写准备
//				}
//				keyIterator.remove();
//			}
//		}
	}
}
