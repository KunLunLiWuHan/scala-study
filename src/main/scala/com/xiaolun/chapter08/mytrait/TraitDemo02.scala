package com.xiaolun.chapter08.mytrait

object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C()
    val e = new E()
    c.getConnect("root","123")
    e.getConnect("root1","1234")
  }
}

//定义一个trait
trait trait1 {

  /**
   * 1、声明方法，抽象的
   * 2、定义一个规范
   */
  def getConnect(user: String, pwd: String): Unit
}

class A {}

class B extends A {}

class C extends A with trait1 {
  override def getConnect(user: String, pwd: String): Unit = {
    println("c连接mysql")
  }
}

class D {}

class E extends D with trait1 {
  def getConnect(user: String, pwd: String): Unit = {
    println("e连接oracle")
  }
}

class F extends D {}
