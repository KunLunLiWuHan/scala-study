package com.xiaolun.chapter07;

public class JavaFiledOverride {
    public static void main(String[] args) {
        /**
         * 1、创建两个对象
         * 2、对于同一个对象，用父类的引用去取值，回取到父类字段的值，
         * 用子类的引用去取值，取到子类字段的值。
         */
        Super c1 = new Super();  //super
        System.out.println(c1.s);

        sub1 c2 = new sub1();  //sub
        System.out.println(c2.s);

        Super c3 = new sub1(); //super
        System.out.println(c3.s);

    }
}

class Super {
    String s = "super";
}

class sub1 extends Super {
    String s = "sub";
}
