package com.xiaolun.chapter13

object ParameterInfer {
  def main(args: Array[String]): Unit = {

    //1、案例1
    val list = List(1, 2, 3, 4)
    //传入匿名函数；输出(2,3,4,5)
    println(list.map((x: Int) => x + 1))
    //简写
    println(list.map((x) => x + 1))
    println(list.map(x => x + 1))
    println(list.map(_ + 1))

    //案例2
    println(list.reduce(f1))
    println(list.reduce((n1: Int, n2: Int) => n1 + n2))
    println(list.reduce((n1, n2) => n1 + n2))
    val res = list.reduce(_ + _) //此时f1函数可以去掉了
    println(res) //10
  }

  def f1(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
