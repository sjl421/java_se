package com.thinktik.demo08.extend;

class Ios8 extends Ios7 {
    @Override
    public void siri() {
        System.out.println("说中文");
        super.siri();
    }
}
