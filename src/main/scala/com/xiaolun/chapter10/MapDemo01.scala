package com.xiaolun.chapter10

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 构建Map
     * 1、默认Map是immutable.Map
     * 2、key-value类型支持Any
     */
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1)

    //构建可变映射
    val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    /**
     * Map(Bob -> 20, Kotlin -> 30, Alice -> 10)
     * 从输出的结果看到，输出顺序和声明顺序不一致
     */
    println(map2)

    //创建空的映射
    val map3 = new scala.collection.mutable.HashMap[String, Int]
    //Map()
    println(map3)

    //对偶元组
//    val map4 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30) )
//    //map4=Map(D -> 30, A -> 1, C -> 3, B -> 2)
//    println("map4=" + map4)
//    println(map4("A")) //1


    val value1 = map2("Alice")
    println(value1)

    //使用contains方法检查是否存在key
    val map4 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30.9) )
    if( map4.contains("B") ) {
      println("key存在 值= " + map4("B"))
    } else {
      println("key不存在")
    }

    println("----------map5测试-------")
    /**
     * 1、map.get方法会将数据进行包装
     * 2、如果 map.get(key) key存在返回some,如果key不存在，则返回None
     * 3、如果 map.get(key).get  key存在，返回key对应的值,否则，
     * 抛出异常 java.util.NoSuchElementException: None.get
     */
    var map5 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    println(map5.get("A")) //some(1)
    println(map5.get("A").get) //得到Some然后再取出

    println("----------map6测试-------")
    /**
     * 1、如果key存在，返回key对应的值。
     * 2、如果key不存在，返回默认值。在java中底层有很多类似的操作。
     */
    val map6 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    println(map6.getOrElse("A","默认")) //1
    println(map6.getOrElse("D","默认值")) //默认值
  }
}
