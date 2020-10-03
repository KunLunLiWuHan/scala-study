package com.xiaolun.chapter10

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 创建时，直接分配元素
     * 1、默认情况下List是scala.collection.immutable.List，即不可变长度
     * 2、在scala中，如果需要使用可变的list,使用ListBuffer
     */
    val list01 = List(1, 2, 3)
    println(list01)

    //空集合
    val list02 = Nil
    println(list02) //输出：List()
  }
}
