package com.xiaolun.chapter10

import scala.collection.mutable

object MapDemo02 {
  def main(args: Array[String]): Unit = {
    //    val map1 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    ////    map1("AA") = 20
    ////    map1("B") = "上海"
    ////    //Map(A -> 1, AA -> 20, C -> 3, B -> 上海)
    ////    println(map1)
    ////
    ////
    ////    val map2 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    ////    map2 += ( "D" -> 4 ) //添加元素
    ////    map2 += ( "B" -> "上海" ) //（已经存在的key）修改元素
    ////    //Map(D -> 4, A -> 1, C -> 3, B -> 上海)
    ////    println(map2)
    ////
    ////    //增加多个元素
    ////    val map3 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    ////    val map4 = map3 + ("E"->1, "F"->3)
    ////    map3 += ("EE"->1, "FF"->3)
    ////    //Map(A -> 1, C -> 3, EE -> 1, B -> 北京, FF -> 3)
    ////    println(map3)
    ////    //Map(A -> 1, C -> 3, F -> 3, E -> 1, B -> 北京)
    ////    println(map4)
    ////
    ////    //删除map元素
    ////    val map5 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    ////    map5 -= ("A", "B")
    ////    //map5=Map(C -> 3)
    ////    println("map5=" + map5)

    val map1 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))

    /**方式1：很简洁
     * 输出：A is mapped to 1
     */
    for ((k, v) <- map1) println(k + " is mapped to " + v)
    /**
     * 方式2：和方式1差不多
     * 1、输出：(A,1)，(C,3)
     * 2、取出方式v类型是Tuple2
     */
    for (v <- map1) println(v)
    //输出：(A,1),key = A,value = 1
    for (v <- map1) println(v + ",key = " + v._1 + ",value = "+ v._2)

    //只关心key,将key值取出来
    for (k <- map1.keys) println(k)
    //只关心value,将value值取出来
    for (v <- map1.values) println(v)



  }
}
