package com.xiaolun.chapter10

object TupleDemo02 {
  def main(args: Array[String]): Unit = {
    val t1 = (1, "a", "b", true, 2)
    println(t1._1) //访问元组的第一个元素 ，从1开始
    println(t1.productElement(0)) // 访问元组的第一个元素，从0开始

    for(item <- t1.productIterator){
      println(item)
    }
  }
}
