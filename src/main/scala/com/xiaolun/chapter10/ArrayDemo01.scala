package com.xiaolun.chapter10

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、创建了一个Array对象
     * 2、[Int]表示泛型，即该数组中，只能存放Int型
     * 3、[Any]表示该数组可以存放任务数组。
     * 4、在没有赋值的情况下，各个元素的值为0
     */
    val arr01 = new Array[Int](4)
    println(arr01.length) //4
    println("arr01(0)=" + arr01(0))//0

    //数组的遍历
    for (i <- arr01) {
      println(i)
    }
    println("--------------------")

    //数组的修改，通过下标
    arr01(3) = 10
    for (i <- arr01) {
      println(i)
    }
  }
}
