package com.xiaolun.chapter12

object CaseDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、该案例的作用就是体验使用样例类方式进行对象匹配的间接性
     * 2、不需要写unapply方法
     */
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        //说明
        case Dollar(v) => "$" + v
        //说明
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }

      /**
       * Dollar(1000.0): $1000.0
       * Currency(1000.0,RMB): 1000.0 RMB
       * NoAmount:
       */
      println(amt + ": " + result)
    }
  }
}


abstract class Amount

//下面三个都是样例类
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
