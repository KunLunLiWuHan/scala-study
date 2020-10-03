package com.xiaolun.chapter11

object HigOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
    test2(sayOK)
  }

  /**
   * 1、test2是一个高阶函数，可以接收一个没有输入且返回值为Unit的函数
   *
   */
  def test2(f: () => Unit) = {
    f()
  }

  def sayOK() = {
    println("sayOKKK...")
  }

}
