package com.thinktik.demo08.extend;

class Son2 extends Father2 {
    public Son2() {
        super();                            //这是一条语句,如果不写,系统会默认加上,用来访问父类中的空参构造
        System.out.println("Son 的构造方法");
    }
}
