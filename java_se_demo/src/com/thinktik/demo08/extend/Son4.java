package com.thinktik.demo08.extend;

class Son4 extends Father4 {
    public void method() {
        System.out.println("Zi Method");
    }

    @Override
    public void print() {
        super.print();                            //super可以调用父类的成员方法
        System.out.println("Zi print");
    }

    public void print(String str) {
        super.print();
        System.out.println(str);
    }

//	public String print(String str) {
//		super.print();
//		System.out.println(str);
//	}
}
