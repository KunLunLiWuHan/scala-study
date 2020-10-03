package com.xiaolun.chapter02

object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    //-+可以，-a报错
    var ++ = "hell0";

    var `true` = "hello2";
    println(`true`)
  }
}
