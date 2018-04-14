package com.thinktik.demo27;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ObjectDemo01 {
	public static void main(String[] args) {
		String name ="A";
		String password = "B";
		
		
//		ObjectDemo01A o1 = new ObjectDemo01A(name, password);
//		ObjectDemo01A o2 = new ObjectDemo01A(name, password);
//		System.out.println(o1.hashCode());
//		System.out.println(o1.hashCode());
//		System.out.println(o1.hashCode());
//		System.out.println(o2.hashCode());
//		System.out.println(o2.hashCode());
//		
//		int hashCode1 = "".hashCode();
//		int hashCode2 = "".hashCode();
		
		
		
		
		ObjectDemo01A o3 = new ObjectDemo01A(name, password);
		ObjectDemo01A o4 = new ObjectDemo01A(name, password);
		System.out.println(o3.equals(o4));
		System.out.println(o3.hashCode() == o4.hashCode());
		Map<ObjectDemo01A, ObjectDemo01A> map = new HashMap<>();
		map.put(o3, o4);
		ObjectDemo01A o5 = new ObjectDemo01A(name, password);
		System.out.println(map.get(o3));
		System.out.println(map.get(o5));
	}
}

class ObjectDemo01A{
	private String name;
	private String password;
	public ObjectDemo01A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ObjectDemo01A(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectDemo01A other = (ObjectDemo01A) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ObjectDemo01A [name=" + name + ", password=" + password + "]";
	}
	
}
