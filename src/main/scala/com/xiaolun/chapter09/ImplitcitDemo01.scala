package com.xiaolun.chapter09

object ImplitcitDemo01 {
  def main(args: Array[String]): Unit = {


    //编写一个隐式函数转换成Double -> Int转换
    //隐式函数应该在作用域中才能生效
    implicit def f1(d: Double): Int = { //底层生成 f1$1
      d.toInt
    }

    //引用了隐式转换
    var num: Int = 3.5 //底层编译 f1$1(3.5)
    println("num=" + num)
  }
}


