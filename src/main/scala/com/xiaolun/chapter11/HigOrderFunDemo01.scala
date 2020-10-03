package com.xiaolun.chapter11

object HigOrderFunDemo01 {
  def main(args: Array[String]): Unit = {

    /**
     * 1、使用高阶函数
     * 2、test(sum, 6.0)中sum不用加()，因为传入的是一个函数
     * 若带上()表示该函数执行了。
     * 3、sum(6.0)返回什么值，高阶函数就返回什么值
     * 4、也可以将sum 换成 sum _，_表示将一个函数传递给别人
     */
    val res = test(sum, 6.0)
    println("res=" + res) //12.0

    /**
     * 1、在scala中。可以把一个函数直接赋值给一个变量，但是不执行该函数
     * 2、我们通过在函数后面添加“_”,如果无“_”函数中方法会执行。
     * 3、方法需要将()去掉
     */
    val f1 = myPrint _
    f1() //执行
  }

  /**
   * 1、test就是一个高阶函数
   * 2、f: Double（接收） => Double（返回）表示一个函数
   * 该函数可以接收一个Double参数，并返回一个Double参数。
   * 3、n1: Double表示普通参数
   * 4、f(n1)表示在test函数中执行你传入的函数
   */
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  //普通函数
  def sum(d: Double): Double = {
    d + d
  }

  def myPrint(): Unit = {
    println("hello world!")
  }
}
