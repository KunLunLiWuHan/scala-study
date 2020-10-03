package com.xiaolun.chapter13

object PartialFunDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")
    val list2 = list.map(addOne2)
    //List(2, 3, 4, 5, ()),有个()，不太好
    println(list2)
  }

  //思路2:模式匹配
  def addOne2(i: Any): Any = {
    i match {
      case x: Int => x + 1
        //代表()
      case _ =>
    }
  }
}
