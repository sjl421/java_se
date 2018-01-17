package com.thinktik.constructor;

/**
 * @author think
 * 2018年1月17日下午9:36:33
 * 
 */
class Demo2_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();

		System.out.println("---------------------");

		Person p2 = new Person("张三",23);
		p2.show();

		System.out.println("---------------------");

		Person p3 = new Person("李四",24);
		p3.show();
	}
}

/*
* A:案例演示
	* 构造方法的重载
	* 重载:方法名相同,与返回值类型无关(构造方法没有返回值),只看参数列表
* B:构造方法注意事项
	* a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
	* b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		* 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
		
*/

/*class没有写public 就是default 
 * 对于顶级类(外部类)来说，只有两种修饰符：public和默认(default)。
 * 因为外部类的上一单元是包，所以外部类只有两个作用域：同包，任何位置。
 * 因此，只需要两种控制权限：包控制权限和公开访问权限，也就对应两种控制修饰符：public和默认(default)。
 * 既然你问的类使用了private修饰符，说明是个内部类。内部类的上一级是外部类，那么对应的有四种访问控制修饰符：本类(private)，同包(default)，父子类(protected)，任何位置(public)。
 * 当一个内部类使用了private修饰后，只能在该类的外部类内部使用。
 * */

//同一个包下已经有了Person这个同名的类,所以eclipse检查会报错  不过手动编译的话不影响
class Person {
	private String name;			//姓名
	private int age;				//年龄

	public Person() {				//空参构造
		System.out.println("空参的构造");
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
}