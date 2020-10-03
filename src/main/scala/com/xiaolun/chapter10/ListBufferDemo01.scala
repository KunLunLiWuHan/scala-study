package com.xiaolun.chapter10

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    //创建ListBuffer
    val lst0 = ListBuffer[Int](1, 2, 3)

    //访问
    println("lst0(2)=" + lst0(2)) //3
    //遍历，有序
    for (item <- lst0) {
      println("item=" + item)
    }

    //创建一个空的listbuffer
    val lst1 = new ListBuffer[Int]
    //动态的添加元素，对list1直接变化
    lst1 += 4  //ListBuffer(4)
    lst1.append(5) //ListBuffer(4, 5)
    println("lst1="+ lst1)

    //把一个集合加到另外一个集合中。
    lst0 ++= lst1  //ListBuffer(1, 2, 3, 4, 5)

    val lst2 = lst0 ++ lst1 //ListBuffer(1, 2, 3, 4, 5,4,5)
    val lst3 = lst0 :+ 5 //ListBuffer(1, 2, 3, 4, 5,5)

    println("=====删除=======")
    println("lst1=" + lst1)
    lst1.remove(1)
    for (item <- lst1) {
      println("item=" + item)
    }
  }
}
