package com.xiaolun.chapter14

object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
      println(max1(List(1,9,-1,10)))
  }

  //使用递归求list中的最大元素
  def max1(xs: List[Int]): Int = {
    if (xs.isEmpty)
      throw new java.util.NoSuchElementException
    if (xs.size == 1) //如果有一个元素，就是器本身
      xs.head
      //将头部一步步进行拆解
    else if (xs.head > max1(xs.tail)) xs.head
    else max1(xs.tail)
  }
}
