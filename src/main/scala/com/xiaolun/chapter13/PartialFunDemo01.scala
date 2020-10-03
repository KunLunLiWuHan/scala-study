package com.xiaolun.chapter13

object PartialFunDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")

    //思路1：使用map+fliter的思路
    def f1(n: Any): Boolean = {
      n.isInstanceOf[Int]
    }

    def f2(n: Int): Int = {
      n + 1
    }

    def f3(n: Any): Int = {
      n.asInstanceOf[Int]
    }

    /**
     * 1、f1：将list中的Int类型的数据给过滤出来，
     * 但此时过滤出来的集合对应类型为Any
     * 2、f2：对数据进行 + 1操作
     * 3、f3：将Any类型的集合编程Int类型
     */
    val list2 = list.filter(f1).map(f3).map(f2)
    //List(2, 3, 4, 5)
    println("list2=" + list2)
  }
}
