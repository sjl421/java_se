package com.thinktik.demo27;

import java.util.HashMap;
import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Bule a = new Bule();
		a.setA(1);
		
		Bule b = new Bule();
		System.out.println();
		
		//---------------------------
		a.printA();
		SubBlue subBlue1 = new SubBlue();
		subBlue1.printA();
		Bule bule1 = subBlue1;
		bule1.printA();
		SubBlue subBlue2 = (SubBlue) bule1;
		subBlue2.printA();
     
		
//		Bule bule1 = new Bule();    // a= 0
//		SubBlue subBlue1 = new SubBlue(); // 1 2     -- 0     
//		
//		bule1.printA();// 1    /2
//		subBlue1.printA();//2     /2
//		subBlue1.setA(3);
//		bule1.printA();//2   /3  
//		subBlue1.printA();//2  /3

	}
}
