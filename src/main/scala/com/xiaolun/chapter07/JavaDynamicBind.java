package com.xiaolun.chapter07;

public class JavaDynamicBind {
	public static void main(String[] args) {
		/**
		 * 1、将一个子类的对象地址，交给了A（父类）引用
		 * 2、java动态绑定机制小节
		 * （1）如果调用的是方法，则JVM会将该方法和对象的内存地址绑定。比如
		 *  当B中的sum注释的时候，a.sum()会调用父类A中的sum()方法，但是在该方法中
		 *  有一个方法getI()，此时对应的是子类B的地址，输出值为20,所以20+10=30
		 * （2）如果调用的是一个属性，没有动态绑定机制，在哪里调用，就返回对应值。比如，
		 *  当B中的sum1注释的时候，a.sum1()会调用父类A中的sum1()方法，但是在该方法中
		 *  有一个属性值i，无绑定机制，正常输出i的值5,所以5+10=15
		 *  3、没有注释B中的sum()和sum1()方法的时候输出结果为40，40;反之输出结果为30，15
		 */
		A a = new B();
		System.out.println(a.sum());  //40 //30
		System.out.println(a.sum1()); //40 //15
	}
}

class A {
	public int i = 5;

	public int sum() {
		return getI() + 10;
	}

	public int sum1() {
		return i + 10;
	}

	public int getI() {
		return i;
	}
}

class B extends A {
	public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

	public int getI() {
		return i;
	}

//    public int sum1() {
//        return i + 20;
//    }
}
