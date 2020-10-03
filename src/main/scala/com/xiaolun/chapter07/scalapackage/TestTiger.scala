package com.xiaolun.chapter07.scalapackage

object TestTiger {
  def main(args: Array[String]): Unit = {
    //使用xh的tiger
    val tiger1 = new com.xiaolun.chapter07.scalapackage.xh.Tiger

    //使用xh的tiger
    val tiger2 = new com.xiaolun.chapter07.scalapackage.xm.Tiger

    println(tiger1 + "\t" + tiger2)
  }
}



