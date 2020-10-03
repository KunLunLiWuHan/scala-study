package com.xiaolun.chapter10

object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    val str = "hello"
    //字符串在scala中就是char的集合IndexSeq
    for (item <- str){
      println(item)
    }

    println(str(2)) //索引：l
  }
}
