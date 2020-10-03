package com.xiaolun.chapter11

object ParDemo01 {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println(_))
    println()

    /**
     * 并行计算
     * 1、将输出任务分散到不同的cpu。
     * 2、输出1,3,4,2,5，结果无序。
     */
    (1 to 5).par.foreach(println(_))
  }
}
