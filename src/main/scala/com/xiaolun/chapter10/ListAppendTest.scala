package com.xiaolun.chapter10

object ListAppendTest {
  def main(args: Array[String]): Unit = {
    //    var list1 = List(1, 2, 3, "abc")
    //    // :+运算符表示在列表的最后增加数据
    //    val list2 = list1 :+ 4
    //    println(list1) //list1没有变化
    //    println(list2) //新的列表结果是 [1, 2, 3, "abc", 4]

    //    var list1 = List(1, 2, 3, "abc")
    //    // :+运算符表示在列表的最后增加数据
    //    val list2 = 4 +: list1
    //    println(list1) //list1没有变化
    //    println(list2) //List(4, 1, 2, 3, abc)

        val list1 = List(1, 2, 3, "abc")
    //    /**
    //     * 1、list()
    //     * 2、list(List(1, 2, 3, abc))
    //     * 3、list(6,List(1, 2, 3, abc))
    //     */
    //    val list5 = 4 :: 5 :: 6 :: list1 :: Nil
    //    println(list5) //List(4, 5, 6, List(1, 2, 3, abc))
    /**
     * 1、list()
     * 2、list（1, 2, 3, abc)（将原有数据打散后放进去）
     */
    val list7 = 4 :: 5 :: 6 :: list1 ::: Nil
    println(list7) //List(4, 5, 6, 1, 2, 3, abc)

  }
}
