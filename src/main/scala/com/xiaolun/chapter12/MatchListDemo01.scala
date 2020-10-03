package com.xiaolun.chapter12

object MatchListDemo01 {
  def main(args: Array[String]): Unit = {
    for (list <- Array(List(0),List(88),List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //匹配只有一个元素且为0的list
        case x :: Nil => x  //匹配 List(88) 这样的只含有一个元素的列表,并原值返回
        case x :: y :: Nil => x + " " + y //list有两个元素
        case 0 :: tail => "0 ..." // 如果list是以0开头，后面有任意元素
        case _ => "something else"
      }

      /**
       * 0
       * 88
       * 1 0
       * 0 ...
       * something else
       */
      println(result)
    }
  }
}
