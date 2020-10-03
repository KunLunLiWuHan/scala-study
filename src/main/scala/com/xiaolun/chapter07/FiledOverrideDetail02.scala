package com.xiaolun.chapter07

object FiledOverrideDetail02 {
  def main(args: Array[String]): Unit = {
    val b = new BBB
    println(b.sal) //0

    val b2: AAA = new BBB
    println(b2.sal) //也是输出0
  }
}

class AAA {
  def sal(): Int = {
    return 10
  }
}

class BBB extends AAA {
  override val sal: Int = 0
}
