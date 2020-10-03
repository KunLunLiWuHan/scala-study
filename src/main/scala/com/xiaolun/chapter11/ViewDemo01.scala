package com.xiaolun.chapter11

object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    //说明: 没有使用view,常规方式
    val viewSquares1 = (1 to 100)
      .filter(eq)
    //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99)
    println(viewSquares1)

    println("------------------------------------")

    /**
     * 使用view
     * 1、在程序中，对集合进行map，filter..
     * 不希望立即执行，而是使用到结果时才执行，
     * 此时，可以使用view来优化
     */
    val viewSquares2 = (1 to 100)
      .view
      .filter(eq)
    println(viewSquares2) //SeqViewF(...)

    /**
     * 1、使用到结果时，能够正常输出。
     * 2、将获得参数存到缓存中，用到时
     * 将其拿出来。
     */
    for (item <- viewSquares2) {
      println("item = " + item)
    }

  }

  //如果这个数，逆序后和原来相等，返回true,否则返回false
  def eq(i: Int): Boolean = {
    i.toString.equals(i.toString.reverse)
  }
}
