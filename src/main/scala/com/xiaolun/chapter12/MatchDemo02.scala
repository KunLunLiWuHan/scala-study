package com.xiaolun.chapter12

object MatchDemo02 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1

        /**
         * 1、如果case后面又条件守卫即if,那么这时的 _ 不是表示默认匹配
         * 而是表示传入的 ch 不接收。
         */
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }



  }
}
