package com.xiaolun.chapter13

object CurryDemo01 {
  def main(args: Array[String]): Unit = {
    //使用常规的方式完成
    def mul(x: Int, y: Int) = x * y

    println(mul(10, 10))

    //使用闭包的方式完成
    def mulCurry(x: Int) = (y: Int) => x * y

    println(mulCurry(10)(9))

    //使用函数柯里化完成
    def mulCurry2(x: Int)(y: Int) = x * y

    println(mulCurry2(10)(8))
  }
}
