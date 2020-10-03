package com.xiaolun.chapter18

object GenericDemo03 {
  def main(args: Array[String]): Unit = {
    // 定义一个函数，可以获取各种类型的 List 的中间index的值
    val list1 = List("jack", 100, "tom")
    val list2 = List(1.1, 30, 32, 41)

    println(getMidEle(list1))
    println(getMidEle(list2))
  }

  // 定义一个方法接收任意类型的 List 集合
  def getMidEle[A](l: List[A]) = {
    l(l.length / 2)
  }
}

