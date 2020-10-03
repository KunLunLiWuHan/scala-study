package com.xiaolun.chapter11

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    // 折叠
    val list = List(1, 2, 3, 4)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    /**
     * 1、list.foldLeft(5)(minus) 可以理解为
     * list(5,1,2,3,4) list.reduceleft(minus)
     * 2、foldRight
     * list(1,2,3,4,5) list.reduceRight(minus)
     */
    println(list.foldLeft(5)(minus)) // 函数的柯里化
    println(list.foldRight(5)(minus))

  }
}
