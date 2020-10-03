package com.xiaolun.chapter11

object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")

    def upper(s: String): String = {
      s.toUpperCase
    }
    //注意：每个字符串也是char集合
    /**
     * 1、需求：将List集合中的所有元素，进行扁平化操作，
     * 即把所有元素打散
     * 2、List(A, L, I, C, E, B, O, B, N, I, C, K)
     */
    println(names.flatMap(upper))

  }
}
