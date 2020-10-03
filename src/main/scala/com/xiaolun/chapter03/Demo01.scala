package com.xiaolun.chapter03

object Demo01 {
  def main(args: Array[String]): Unit = {
    // /使用
    var r1 : Int = 10 / 3  //3
    println("r1=" + r1)
    var r2 : Double = 10 / 3 //3.0
    println("r2=" + r2)

    //有一个为double类型，故可以保留小数部分
    var r3 : Double = 10.0 / 3
    println("r3=" + r3 )
    //格式化输出
    println("r3=" + r3.formatted("%.2f") )

    //%的使用,a%b=a-a/b*b
    println(10 % 3) //1
    // -10 -(-10)/3*3 = -10-(-3)*3 = -10 + 9 =-1
    println(-10 % 3)
  }
}
