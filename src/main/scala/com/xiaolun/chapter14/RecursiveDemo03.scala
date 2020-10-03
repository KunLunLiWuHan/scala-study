package com.xiaolun.chapter14

object RecursiveDemo03 {
  def main(args: Array[String]): Unit = {
    println(factorial(3))
  }

  def factorial(n: Int): Int =
    if (n == 0) 1
    else n * factorial(n - 1)
}
