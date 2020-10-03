package com.xiaolun.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 30, 4, 5)

    def sum(n1: Int, n2: Int): Int = {
      n1 + n2
    }

    /**
     * 使用化简的方式来计算list集合的和
     * 1、reduceLeft(f) 接收的函数需要的形式为 op: (B, A) => B): B
     * 2、reduceleft(f) 的运行规则是 从左边开始执行将得到的结果返回给第一个参数
     * 然后继续和下一个元素运行，将得到的结果继续返回给第一个参数，继续..
     * 3、((((1 + 2)  + 3) + 4) + 5) = 15
     */
    val res = list.reduceLeft(sum)
    println("res=" + res)

  }
}
