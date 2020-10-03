package com.xiaolun.chapter03.inputcon

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    var name = StdIn.readLine()
    printf("用户的姓名为：name =%s", name)
  }
}
