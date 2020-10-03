package com.xiaolun.chapter05.myLazy

object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    //如果没有lazy关键字，sum()求和函数会被执行。
    lazy val res = sum(10, 20)
    println("-----------------")
    //当要使用res 时，sun才执行
    println("res=" + res)
  }

  //求和函数
  def sum(n1: Int, n2: Int): Int = {
    //证明函数又没有执行，输出一句话
    println("sum() 执行了..")
    n1 + n2
  }
}