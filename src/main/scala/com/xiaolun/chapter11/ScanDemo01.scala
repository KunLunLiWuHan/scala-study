package com.xiaolun.chapter11

object ScanDemo01 {
  def main(args: Array[String]): Unit = {

    /**
     * 5 (1,2,3,4,5) =>(5,4,2,-1,-5,-10)
     * 步骤：
     * （1）将5放到左边并保存
     * （2）5和1进行折叠，（5-1）=4 并将结果保存放到第二个位置上
     * （3）4-2 = 2
     * ...
     */
    val i8 = (1 to 5).scanLeft(5)(minus) // i8 类型：IndexedSeq[Int]
    println(i8)


    //5 (1,2,3,4,5) =>(5,6,8, 11,15,20)
    val i9 = (1 to 5).scanLeft(5)(add) //IndexedSeq[Int]
    println(i9)

  }

  //普通函数
  def minus(num1: Int, num2: Int): Int = {
    num1 - num2
  }

  def add(num1: Int, num2: Int): Int = {
    num1 + num2
  }
}
