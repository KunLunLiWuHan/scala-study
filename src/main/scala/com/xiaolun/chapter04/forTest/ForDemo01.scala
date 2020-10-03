package com.xiaolun.chapter04.forTest

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    var start = 1
    var end = 3
    for (i <- start to end) {
      println(i + "你好")
    }

    //for推导式也可以直接对集合进行遍历
    var list = List("hello", 10, 30)
    for (item <- list) {
      println("item=" + item)
    }

    //循环守卫
    for (i <- 1 to 3 if i != 2) {
      println(i + " 循环守卫")
    }
    //引入变量
    for (i <- 1 to 3; j = 4 - i) {
      println(j + " ")
    }

    //循环返回值
    val res = for (i <- 1 to 10) yield {
      i
    }
    println(res)

    //步长控制 Range = new Range(start, end, step)
    for(i <- Range(1,10,2)){
      println("i=" + i)
    }

  }
}
