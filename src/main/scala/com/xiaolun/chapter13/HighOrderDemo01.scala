package com.xiaolun.chapter13

object HighOrderDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、minusxy是一个高阶函数，
     * 因为它返回一个匿名函数(y: Int) => x - y
     * 2、返回的匿名函数，可以使用变量接收
     */
    def minusxy(x: Int) = {
      (y: Int) => x - y //匿名函数
    }

    /**
     * 分步执行
     * 1、f1代表 (y: Int) => 3 - y，在f1的生命周期以内
     * "3"是固定不变的。
     * 2、f1(5) 等价于 3- 5
     */
    val f1 = minusxy(3)
    println(f1(5))
    //    val result3 = minusxy(3)(5)
    //    println(result3)    //-2
  }
}
