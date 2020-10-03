package com.xiaolun.chapter11

object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")

    def startA(s: String): Boolean = {
      s.startsWith("A")
    }

    val names2 = names.filter(startA)
    println("names=" + names2)
  }
}
