package com.xiaolun.chapter01

object LookSourceCode {
  def main(args: Array[String]): Unit = {

    //看Array的源码
    var arr = new Array[Int](10)
    for (item <- arr){
      println("item="+item)
    }
//    println("arr="+arr.toString)
  }
}
