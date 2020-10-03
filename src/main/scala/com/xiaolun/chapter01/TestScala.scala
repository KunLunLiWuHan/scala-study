package com.xiaolun.chapter01

/**
 * 看到object，我们有这样的认识：
 * 1.object TestScala对应的是一个TestScala$的一个静态对象，
 * 2.在整个程序中，是一个单例。
 */
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello,world!")
  }
}
