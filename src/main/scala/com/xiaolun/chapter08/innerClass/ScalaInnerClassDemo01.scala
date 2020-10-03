package com.xiaolun.chapter08.innerClass

object ScalaInnerClassDemo01 {
  def main(args: Array[String]): Unit = {
    val outer1: ScalaOuterClass = new ScalaOuterClass();
    val outer2: ScalaOuterClass = new ScalaOuterClass();

    /**
     * 1、Scala创建内部类的方式和Java不一样，将new关键字放置在前
     * 使用  对象.内部类  的方式创建
     * 2、默认情况下，内部类实例和外部对象关联
     */
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()

    /**
     * 1、测试使用inner1，调用info()
     * 在内部类中访问外部类的属性。
     */
    inner1.info()

    /**
     * 在默认情况下，scala的内部类的实例和创建该内部实例
     * 的外部对象相关联
     */
      inner1.test(inner1)
      inner1.test(inner2) //不会报错

    //创建静态内部类对象，和java一样
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)
  }
}

class ScalaOuterClass {

  //  var name: String = "scott"
  //  private var sal: Double = 1.2
  //
  //  class ScalaInnerClass { //成员内部类
  /**
   * 方式1:在内部类中访问外部内的属性
   * 内部类如果想要访问外部类的属性，可以通过外部类对象访问。
   * 即：访问方式：外部类名.this.属性名
   */
  //    def info() = {
  //      // 访问方式：外部类名.this.属性名
  //      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
  //      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
  //      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
  //      println("name = " + ScalaOuterClass.this.name
  //        + " sal =" + ScalaOuterClass.this.sal)
  //    }
  //  }

  /**
   * 方式2：
   * 内部类如果想要访问外部类的属性，也可以通过外部类别名访问(推荐)。
   * 即：访问方式：外部类名别名.属性名   （外部类名.this  等价 外部类名别名）
   * myOuter => 这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
   */
  myOuter => //这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
  class ScalaInnerClass { //成员内部类
    def info() = {
      println("name = " + ScalaOuterClass.this.name
        + " age =" + ScalaOuterClass.this.sal)
      println("-----------------------------------")
      println("name ~= " + myOuter.name
        + " sal~ =" + myOuter.sal)
    }

    /**
     * 1、投影（外部类加进来：ScalaOuterClass#）：编译器会知道接收内部类
     * 不要考虑外部类的对象，只需要接收内部类就可以了。
     * 作用：屏蔽外部对象对于内部实例的影响
     * 2、inner1.test(inner2) 不会报错
     */
    def test(ic: ScalaOuterClass#ScalaInnerClass): Unit = {
      System.out.println(ic)
    }

  }

  // 当给外部指定别名时，需要将外部类的属性放到别名后.
  var name: String = "scott"
  private var sal: Double = 1.2
}

object ScalaOuterClass { //伴生对象
  class ScalaStaticInnerClass { //静态内部类
  }

}

