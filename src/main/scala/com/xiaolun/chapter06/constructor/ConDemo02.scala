package com.xiaolun.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val test = new Test01("xiaohei")
    //不可以写
//    test.inName = "aaa"
    println(test.inName)
  }
}

class Test01(val inName: String ){
  var name = inName
}