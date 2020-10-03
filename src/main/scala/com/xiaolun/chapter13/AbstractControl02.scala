package com.xiaolun.chapter13

object AbstractControl02 {
  def main(args: Array[String]): Unit = {
    var x = 10

    //循环操作
    while(x > 0){
      x -= 1
      println("x="+x)
    }

    println("---------------------------------")
    //使用控制抽象写出until函数，实现类似while的循环效果
    x = 10
    until(x > 0) {
      x -= 1
      println("x=" + x)
    }
  }

  /**
   * 1、接收两个抽象控制，一个没有传入值，但返回boolean
   * 另一个是无传入和返回的值
   */
  def until(condition: => Boolean)(block: => Unit): Unit = {
    //类似while循环，递归
    if (condition) {
      block
      //递归调用until
      until(condition)(block)
    }
  }
}
