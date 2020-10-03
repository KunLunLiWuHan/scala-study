package com.xiaolun.chapter07

object Testvisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()
    Clerk.test(c)
  }
}

class Clerk {
  var name: String = "jack"
  private var sal: Double = 9999.9

  def showInfo(): Unit = {
    println(" name " + name + " sal= " + sal)
  }
}

/**
 * 1、在一个文件中出现了class Clerk 和 object Clerk
 * 前者称为伴生类，后者称为伴生对象。
 * 2、scala设计者将static关键字拿掉，进而设计了伴生类和伴生对象的概念，
 * 将静态内容放到伴生对象中，伴生类写放非静态内容。
 */
object Clerk {
  def test(c: Clerk): Unit = {
    //这里体现出在伴生对象中，可以访问私有属性c.sal
    println("test() name=" + c.name + " sal= " + c.sal)
  }
}


