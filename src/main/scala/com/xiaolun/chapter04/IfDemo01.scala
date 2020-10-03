package com.xiaolun.chapter04

object IfDemo01 {
  def main(args: Array[String]): Unit = {
    var sumVal = 9
    val result = if (sumVal > 20) {
      "结果大于20"
    }
    //输出为()(Unit)
    println(result)
  }
}
