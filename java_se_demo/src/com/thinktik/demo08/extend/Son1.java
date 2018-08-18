package com.thinktik.demo08.extend;

class Son1 extends Father1 {
    int num2 = 20;

    public void print() {
        System.out.println(this.num1);                //this既可以调用本类的,也可以调用父类的(本类没有的情况下)
        System.out.println(this.num2);                //就近原则,子类有就不用父类的了
        System.out.println(super.num2);
    }
}
