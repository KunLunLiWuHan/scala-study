package com.xiaolun.chapter12

object MatchTuple01 {
  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
      val result = pair match {
        case (0, _) => "0 ..." //匹配以0打头的二元组，第二个元素忽略
        case (y, 0) => y // 匹配第二个元素为0的二元组，并将值赋给y
        case _ => "other" //
      }

      /**
       * 0 ...
       * 1
       * other
       * other
       */
      println(result)
    }
  }
}
