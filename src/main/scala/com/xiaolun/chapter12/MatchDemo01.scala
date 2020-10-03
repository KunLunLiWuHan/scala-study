package com.xiaolun.chapter12

object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '#'
    val n1 = 20
    val n2 = 10
    var res = 0

    /**
     * 1、match(类似于java中的switch)和case是关键字
     * 2、每个代码块不需要写break
     */
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)
  }
}
