package com.thinktik.demo06.clazzthis;

public class Person {
        private String name;            //姓名
        private int age;                //年龄
        
        public int getAge() {            //获取年龄
            return age;
        }
        
        public void setAge(int age) {        //设置年龄
            if (age > 0 && age < 200) {
                this.age = age;
                //System.out.println(age);
            } else {
                System.out.println("请回火星吧,地球不适合你");
            }
            
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {    //设置姓名
            this.name = name;
        }
}
