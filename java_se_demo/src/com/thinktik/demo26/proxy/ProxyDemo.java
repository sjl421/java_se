package com.thinktik.demo26.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
		
		demo2();
	}

	private static void demo1() {
		UserImp ui = new UserImp();
		ui.add();
		ui.delete();
		
		System.out.println("-------------------------------");
		
//		 public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
		 
		MyInvocationHandler m = new MyInvocationHandler(ui);
		User u = (User)Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
		u.add();
		u.delete();
	}

	private static void demo2() {
		StudentImp si = new StudentImp();
		si.login();
		si.submit();
		
		System.out.println("-------------------------------");
		MyInvocationHandler m = new MyInvocationHandler(si);
		Student s = (Student)Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
		
		s.login();
		s.submit();
	}

}
