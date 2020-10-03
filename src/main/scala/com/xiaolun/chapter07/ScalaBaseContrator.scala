package com.xiaolun.chapter07

object ScalaBaseContrator {
  def main(args: Array[String]): Unit = {
    /**
     * 执行流程
     * 1、scala遵守先构建父类部分，所以，先执行父类的构造方法
     * 2、执行顺序
     * person...
     * Emp...  ->new Emp001()
     * Emp 辅助构造器 -> new Emp001("merry")
     */
    //    val emp = new Emp001()
    val emp2 = new Emp001("merry")

  }
}

class Person001(pName: String) {
  var name = "zhangsan"
  println("Person...")

  /**
   * 子类无参构造方法会到这一步，
   * 但是不会到下面三个参数的辅助构造方法。
   */
  def this() {
    this("父类名字")
  }

  /**
   * 有三个参数的辅助构造方法不会被执行
   */
  def this(arg1: String, arg2: String, arg3: String) {
    this("父类名字")
  }

}

class Emp001 extends Person001 {
  println("Emp ....")

  //辅助构造器
  def this(name: String) {
    // 必须调用主构造器，不写会报错
    this
    this.name = name
    println("Emp 辅助构造器~")
  }
}
