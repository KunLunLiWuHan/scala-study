package com.xiaolun.chapter11

object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    // 得到迭代器
    val iterator = List(1, 2, 3, 4, 5).iterator
    println("--------遍历方式1 while-----------------")
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("--------遍历方式2 for -----------------")

    /**
     * 1、for循环迭代要保证该集合在上面
     * 没有迭代过（类似指针到最后了）。才能够正常输出。
     */
    for (enum <- iterator) {
      println(enum)
    }
  }
}
