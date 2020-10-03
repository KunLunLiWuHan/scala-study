package com.xiaolun.chapter05

object Method2Function {
  def main(args: Array[String]): Unit = {
    //1.使用方法，我们首先要创建一个对象
    val cat = new Cat
    println(cat.sum(10, 20))

    //2.方法转成函数
    val f1 = cat.sum _
    println("f1=" + f1)
    println("f1=" + f1(10, 30))

    //3.函数，求两个数的和
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }
    println("f2=" + f2)
    println("f2=" + f2(10, 40))
  }
}

class Cat {
  //方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}