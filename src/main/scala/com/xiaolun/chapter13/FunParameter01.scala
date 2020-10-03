package com.xiaolun.chapter13

object FunParameter01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、在scala中，函数也是有类型的，下面的类型为<function1>
     *
     */
    def plus(x: Int) = 3 + x

    //说明
    val result1 = Array(1, 2, 3, 4).map(plus(_))
    //4,5,6,7
    println(result1.mkString(","))
  }
}
