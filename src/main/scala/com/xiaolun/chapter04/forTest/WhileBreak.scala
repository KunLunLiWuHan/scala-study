package com.xiaolun.chapter04.forTest

import scala.util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1

    breakable {
      while (n < 10) {
        n += 1
        println("n=" + n)
        if (n == 8) {

          //import util.control.Breaks._
          //中断
          break()
        }
      }
    }

    //通过breakable函数捕获异常，可以让程序执行输出。
    println("-------ok------")
  }
}
