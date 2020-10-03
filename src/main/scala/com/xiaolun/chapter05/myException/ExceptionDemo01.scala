package com.xiaolun.chapter05.myException

object ExceptionDemo01 {
  def main(args: Array[String]): Unit = {

    try {
      val r = 10 / 0
    } catch {
      /**
       * 1、只有一个catch
       * 2、一个catch中有多个case,一个case就可以匹配发生的一种异常。
       * 3、=>表示关键字，不能改动。后面是对异常的处理代码（也可以是代码块）。
       * 4、finally为最终要执行的代码。
       */
      case ex: ArithmeticException => println("捕获了除数为零的算数异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      // 最终要执行的代码,一般用来释放资源。
      println("scala finally...")
    }
  }
}
