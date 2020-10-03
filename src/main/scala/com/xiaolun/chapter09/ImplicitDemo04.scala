package com.xiaolun.chapter09

object ImplicitDemo04 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、DB1会对应生成隐式类
     * 2、DB1是一个隐式类，当我们在该隐式类的作用域范围内，
     * 创建 MySQL1 的实例时，该隐式类就会生效。
     * 这个工作仍然时编译器实现的。
     */
    implicit class DB1(val m: MySQL1) {
      def addSuffix(): String = {
        m + " scala"
      }
    }

    val mysql1 = new MySQL1
    mysql1.sayOk()
    //mysql1.addSuffix()  ==> 使用这个进行关联：DB1$1(mysql1).addSuffix()
    //DB1$1(mysql1)返回的类型是 ImplicitClass$DB1$2
    println(mysql1.addSuffix())
  }
}

class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }
}
