package com.xiaolun.chapter11

object ReduceDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)


    //((((1-2)-3)-4)-5) = -13
    println(list.reduceLeft(minus)) // -13

    /**
     * (4-5)将结果放到 num2
     * (1-(2-(3-(4-5)))) = 3
     */
    println(list.reduceRight(minus)) //(((-3)-2)-1)
    println(list.reduce(minus)) //-13 等价于reduceLeft

    println("-----------------------------")
    println(list.reduce(min))
  }

  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

  //求出最小值
  def min(n1: Int,n2: Int): Int={
    if(n1 > n2) n2 else n1
  }
}
