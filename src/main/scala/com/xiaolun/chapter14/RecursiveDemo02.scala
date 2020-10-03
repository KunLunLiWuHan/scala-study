package com.xiaolun.chapter14

object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    var str:String = "abcd"
    println(reverse(str))
  }

  //使用递归方式来翻转字符串
  def reverse(xs: String): String =
    if (xs.length == 1) xs
      //将尾巴和头互换
    else reverse(xs.tail) + xs.head
}
