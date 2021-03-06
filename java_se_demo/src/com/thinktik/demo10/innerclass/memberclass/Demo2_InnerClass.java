package com.thinktik.demo10.innerclass.memberclass;

class Demo2_InnerClass {
    public static void main(String[] args) {
        //Outer.Inner oi = new Outer().new Inner();
        //oi.method();

        Outer2 o = new Outer2();
        o.print();
    }
}

class Outer2 {
    private int num = 10;

    public void print() {
        Inner i = new Inner();
        i.method();
    }

    private class Inner {
        public void method() {
            System.out.println(num);
        }
    }
}