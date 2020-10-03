package com.xiaolun.chapter05.myException

object ThrowsDemo01 {
  def main(args: Array[String]): Unit = {
    f11()
  }

  /**
   *1、等同于Java中的 NumberFormatException.class
   * 指定抛出的异常类型是NumberFormatException.class
   */
  @throws(classOf[NumberFormatException])
  def f11() = {
    "abc".toInt
  }
}
