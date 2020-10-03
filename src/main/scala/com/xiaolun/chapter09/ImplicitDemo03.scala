package com.xiaolun.chapter09

object ImplicitDemo03 {
  def main(args: Array[String]): Unit = {
    //隐式值
    implicit val str1: String = "jack"

    //implicit name: String：name就是隐式参数
    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }
    //底层 hello("jack")
    hello //调用时不用带()
  }
}
